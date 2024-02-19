package Model;


public class Student extends User {

    
    private Integer studentID;
    private Double average;
    
    public Student(String name, Integer age, Double average) {
        super(name, age);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student [" + studentID +" , "+ name +" , "+ age + " , "+ average +"]";
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }
}
