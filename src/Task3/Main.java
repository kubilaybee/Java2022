package Task3;

import Task3.Bussiness.CategoryManager;
import Task3.Bussiness.CourseManager;
import Task3.Bussiness.EducatorManager;
import Task3.Core.Logging.DatabaseLogger;
import Task3.Core.Logging.FileLogger;
import Task3.Core.Logging.ILogger;
import Task3.Core.Logging.MailLogger;
import Task3.Core.Validate.CategoryValidator;
import Task3.Core.Validate.CourseValidator;
import Task3.DataAccess.HibernateCourseDao;
import Task3.DataAccess.HibernateEducatorDao;
import Task3.DataAccess.JdbcCategoryDao;
import Task3.Entities.Category;
import Task3.Entities.Course;
import Task3.Entities.Educator;

public class Main {
    public static void main(String[] args) throws Exception{
        Course course1 = new Course(1,"Basic Programing",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course course2 = new Course(2,"C# + Angular",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course course3 = new Course(3,"Java + React",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course course4 = new Course(4,"JavaScript",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course course5 = new Course(5,"(.NET)",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course course6 = new Course(6,"Java",0,"Description","Image",new Category(0,"CategoryName"),new Educator(0,"Engin","Demirog"));

        Course[] courses = {course1,course2,course3,course4,course5,course6};
        ILogger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        Course course7 = new Course(7,"Embedded C++",0,"Description","Img",new Category(0,"Category"),new Educator(0,"Engin","Demirog"));
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),new CourseValidator(courses),loggers);
        courseManager.add(course7);

        Category category1 = new Category(1,"Programming");
        Category[] categories = {category1};
        Category category3 = new Category(3,"Robotic");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), new CategoryValidator(categories),loggers);
        categoryManager.add(category3);

        Educator educator1 = new Educator(1,"tempName","tempSurname");
        EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(),loggers);
        educatorManager.add(educator1);
    }
}
