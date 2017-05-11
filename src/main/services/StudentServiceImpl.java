package main.services;

import main.model.dao.StudentDao;
import main.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aleksei Lysov on 19.04.2017.
 */
@Service
public class StudentServiceImpl implements StudentService{

//    @Autowired
//    public StudentServiceImpl(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    @Autowired
    @Qualifier(value = "studentDao")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    // @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents(){
        return studentDao.findAll();
    }

    public void deleteStudent(int id){
        studentDao.delete(id);
    }

    @Override
    public void insert(Student student) {
        studentDao.insert(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public Student findById(int id) {
        return studentDao.findById(id);
    }
}
