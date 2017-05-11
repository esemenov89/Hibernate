package main.services;

import main.model.entity.Student;

import java.util.List;

/**
 * Created by Aleksei Lysov on 19.04.2017.
 */
public interface StudentService {
    List<Student> getAllStudents();
    void deleteStudent(int id);
    void insert(Student student);
    void update(Student student);
    Student findById(int id);
}
