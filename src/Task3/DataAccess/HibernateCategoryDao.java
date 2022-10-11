package Task3.DataAccess;

import Task3.Entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate added: "+category.getCategoryName());
    }

    @Override
    public void del(Category category) {
        System.out.println("Hibernate deleted: "+category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate updated: "+category.getCategoryName());
    }
}
