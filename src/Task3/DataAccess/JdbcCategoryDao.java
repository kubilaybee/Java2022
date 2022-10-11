package Task3.DataAccess;

import Task3.Entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Jdbc added: "+category.getCategoryName());
    }

    @Override
    public void del(Category category) {
        System.out.println("Jdbc deleted: "+category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbc updated: "+category.getCategoryName());
    }
}
