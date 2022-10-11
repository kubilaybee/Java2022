package Task3.DataAccess;

import Task3.Entities.Course;
import Task3.Entities.Educator;

public interface IEducatorDao {
    void add(Educator educator);
    void del(Educator educator);
    void update(Educator educator);
}
