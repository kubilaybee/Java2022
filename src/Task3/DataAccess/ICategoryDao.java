package Task3.DataAccess;

import Task3.Entities.Category;

public interface ICategoryDao {
    void add(Category category);
    void del(Category category);
    void update(Category category);
}
