package Viev;

import java.util.List;
import java.util.Map;

import Model.Student;
import Model.Teacher;

public class GroupViev {

    public void printGroup(Map<Teacher, List<Student>> map){

        System.out.println("Группа: " + "\n" + map);

    }
    
}
