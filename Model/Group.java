package Model;

import java.util.List;

public class Group {

    private Teacher teacher;
    private List<Student> listStudents;
    
    
    public Group(Teacher teacher, List<Student> listStudents) {
        this.teacher = teacher;
        this.listStudents = listStudents;
    }
    

    
}