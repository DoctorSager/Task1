package service;

import java.util.List;
import java.util.Map;

import Model.Student;
import Model.Teacher;

public interface GroupService {

    Map<Teacher, List<Student>> createGroup(Teacher teacher, List<Student> students);
    
}
