package Task3.DataAccess;

import Task3.Entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate added: "+course.getCourseName());
    }

    @Override
    public void del(Course course) {
        System.out.println("Hibernate deleted: "+course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate updated: "+course.getCourseName());
    }
}
