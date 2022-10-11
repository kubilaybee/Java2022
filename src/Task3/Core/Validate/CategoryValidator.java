package Task3.Core.Validate;

import Task3.Entities.Category;

public class CategoryValidator {
    Category[] categories;

    public CategoryValidator(Category[] categories) {
        this.categories = categories;
    }

    public boolean isValid(Category category) throws Exception{
        for (Category tempCategoriy: categories){
            if (tempCategoriy.getCategoryName()==category.getCategoryName()){
                throw new Exception("Already has been exist");
            }
        }
        return true;
    }
}
