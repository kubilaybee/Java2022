package Task3.Core.Validate;

import Task3.Entities.Course;

public class CourseValidator {
    private Course[] courses;

    public CourseValidator(Course[] courses) {
        this.courses = courses;
    }

    public boolean isValid(Course course) throws Exception{
        for (Course tempCourse: courses){
            if ((tempCourse.getCourseName() == course.getCourseName()) || (tempCourse.getCoursePrice()<0)){
                throw new Exception("Already has been exist or your price is wrong");
            }
        }
        return true;
    }
}
