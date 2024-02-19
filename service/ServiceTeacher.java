package service;

import java.util.List;

import Model.Teacher;
import Model.User;

public interface ServiceTeacher {

    Teacher create(User user);
    List<Teacher> read();
    
}
