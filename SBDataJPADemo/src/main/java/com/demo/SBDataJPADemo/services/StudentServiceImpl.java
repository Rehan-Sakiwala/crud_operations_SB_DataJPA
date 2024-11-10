package com.demo.SBDataJPADemo.services;

import com.demo.SBDataJPADemo.entities.Student;
import com.demo.SBDataJPADemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean addStudentDetails(Student std) {
        boolean status = false;
        try{
            studentRepository.save(std);
            status = true;
        }
        catch (Exception e){
            e.printStackTrace();
            status = false;
        }
        return status;
    }

    @Override
    public List<Student> getAllStudentDetails() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public boolean updateStudentDetails(long id, float marks) {
        boolean status = false;
        try {
            Student student = getStudentById(id);
            if(student != null)
            {
                student.setMarks(marks);
                studentRepository.save(student);
                status = true;
            }
            else{
                status = false;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            status = false;
        }
        return status;
    }

    @Override
    public boolean deletestudentById(long id) {
        boolean status = false;
        try{
            studentRepository.deleteById(id);
            status = true;
        }
        catch(Exception e){
            e.printStackTrace();
            status=false;
        }
        return status;
    }
}
