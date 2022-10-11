package Task3.Entities;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private String courseDescription;
    private String courseImage;
    private Category courseCategory;
    private Educator courseEducator;

    public Course(int courseId, String courseName, double coursePrice, String courseDescription, String courseImage, Category courseCategory, Educator courseEducator) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseDescription = courseDescription;
        this.courseImage = courseImage;
        this.courseCategory = courseCategory;
        this.courseEducator = courseEducator;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }

    public Educator getCourseEducator() {
        return courseEducator;
    }

    public void setCourseEducator(Educator courseEducator) {
        this.courseEducator = courseEducator;
    }
}
