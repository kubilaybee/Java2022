package Task3.Bussiness;

import Task3.Core.Logging.ILogger;
import Task3.Core.Validate.CourseValidator;
import Task3.DataAccess.ICourseDao;
import Task3.Entities.Course;


public class CourseManager {
    private ICourseDao courseDao;
    private CourseValidator courseValidator;
    private ILogger[] courseLoggers;

    public CourseManager(ICourseDao courseDao, CourseValidator courseValidator, ILogger[] courseLoggers) {
        this.courseDao = courseDao;
        this.courseValidator = courseValidator;
        this.courseLoggers = courseLoggers;
    }

    public void add(Course course) throws Exception{
        if (courseValidator.isValid(course)){
            this.courseDao.add(course);
            System.out.printf("Course added: "+course.getCourseName());

            for (ILogger logger:courseLoggers){
                logger.log(course.getCourseName());
            }
        }
    }

    public void delete(Course course){
        this.courseDao.del(course);
        System.out.println(course.getCourseName()+" deleted!");
    }
    public void update(Course course){
        this.courseDao.update(course);
        System.out.println(course.getCourseName()+" updated!");
    }
}
