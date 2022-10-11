package Task3.DataAccess;

import Task3.Entities.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc added: "+course.getCourseName());
    }

    @Override
    public void del(Course course) {
        System.out.println("Jdbc deleted: "+course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Jdbc updated: "+course.getCourseName());
    }
}
