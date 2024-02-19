package Model;


public class Teacher extends User {

    private Integer teacherID;
    private String subject;

    
    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher [" + teacherID +" , "+ name +" , "+ age + " , "+ subject +"]";
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

}
