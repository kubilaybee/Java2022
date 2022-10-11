package Task3.Entities;

public class Educator {
    private int educatorId;
    private String educatorName;
    private String educatorSurname;

    public Educator(int educatorId, String educatorName, String educatorSurname) {
        this.educatorId = educatorId;
        this.educatorName = educatorName;
        this.educatorSurname = educatorSurname;
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getEducatorName() {
        return educatorName;
    }

    public void setEducatorName(String educatorName) {
        this.educatorName = educatorName;
    }

    public String getEducatorSurname() {
        return educatorSurname;
    }

    public void setEducatorSurname(String educatorSurname) {
        this.educatorSurname = educatorSurname;
    }
}
