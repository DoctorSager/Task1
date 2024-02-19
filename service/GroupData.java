package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Student;
import Model.Teacher;

public class GroupData implements GroupService {

    Map<Teacher,List<Student>> group = new HashMap<>();

    @Override
    public Map<Teacher, List<Student>> createGroup(Teacher teacher, List<Student> students) {
        
        group.put(teacher,students);
        
        return group;
    }


    
}
