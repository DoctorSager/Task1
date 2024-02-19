package Controller;

import java.util.List;
import java.util.Map;

import Model.Student;
import Model.Teacher;
import Model.User;
import Viev.GroupViev;
import Viev.StudentViev;
import service.DataStudent;
import service.DataTeacher;
import service.GroupData;

public class Controller {

    private DataStudent dataStudent;
    private DataTeacher dataTeacher;
    private StudentViev studentViev;
    private GroupData groupData;
    private GroupViev groupViev;

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        studentViev = new StudentViev();
        groupData = new GroupData();
        groupViev = new GroupViev();
    }

    public void start(){

        User user1 = new Student("Petya",19,4.5);
        Teacher user2 = new Teacher("Vasya",40,"History");
        User user3 = new Student("Akakiy", 24, 3.4);
        createStudent(user1);
        createStudent(user3);
        createTeacher(user2);
        List<Student> listStudents = dataStudent.read();
        studentViev.printStudent(listStudents);
        

        groupViev.printGroup(createNewGroup(user2, listStudents));
    }

    public Student createStudent(User user){
        return dataStudent.create(user);
    }
    public Teacher createTeacher(User user){
        return dataTeacher.create(user);
    }
    public Map<Teacher, List<Student>> createNewGroup(Teacher teacher,List<Student> listStudents ){
        return groupData.createGroup(teacher, listStudents);
    }

}
