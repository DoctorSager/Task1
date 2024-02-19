package service;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import Model.User;

public class DataStudent implements ServiceStudent {

    List<Student> listStudents = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentID(listStudents.size()+1);
        listStudents.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudents;
    }
}
