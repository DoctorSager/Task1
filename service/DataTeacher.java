package service;

import java.util.ArrayList;
import java.util.List;

import Model.Teacher;
import Model.User;

public class DataTeacher implements ServiceTeacher {

    List<Teacher> listTeachers = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherID(listTeachers.size()+1);
        listTeachers.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return listTeachers;
    }
}
