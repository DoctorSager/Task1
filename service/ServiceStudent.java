package service;

import java.util.List;

import Model.Student;
import Model.User;

public interface ServiceStudent {

    Student create(User user);
    List<Student> read();
    
}
