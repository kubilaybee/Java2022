package Task3.DataAccess;

import Task3.Entities.Category;
import Task3.Entities.Course;

public interface ICourseDao {

    void add(Course course);
    void del(Course course);
    void update(Course course);
}
