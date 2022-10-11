package Task3.Bussiness;

import Task3.Core.Validate.CategoryValidator;
import Task3.DataAccess.ICategoryDao;
import Task3.Entities.Category;
import Task3.Core.Logging.ILogger;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private CategoryValidator categoryValidator;
    private ILogger[] categoryLogger;

    public CategoryManager(ICategoryDao categoryDao, CategoryValidator categoryValidator, ILogger[] categoryLogger) {
        this.categoryDao = categoryDao;
        this.categoryValidator = categoryValidator;
        this.categoryLogger = categoryLogger;
    }

    public void add(Category category) throws Exception{
        if (categoryValidator.isValid(category)){
            this.categoryDao.add(category);
            System.out.println("New category added: "+category.getCategoryName());
            for (ILogger logger:categoryLogger){
                logger.log(category.getCategoryName());
            }
        }
    }

    public void delete(Category category){
        this.categoryDao.del(category);
        System.out.println(category.getCategoryName()+" deleted!");
    }

    public void update(Category category){
        this.categoryDao.update(category);
        System.out.println(category.getCategoryName()+" updated!");
    }
}
