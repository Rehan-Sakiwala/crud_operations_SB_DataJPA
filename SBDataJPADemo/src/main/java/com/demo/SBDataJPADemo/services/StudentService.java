package com.demo.SBDataJPADemo.services;

import com.demo.SBDataJPADemo.entities.Student;

import java.util.List;

public interface StudentService {

    public boolean addStudentDetails(Student std);
    public List<Student> getAllStudentDetails();
    public Student getStudentById(long id);
    public boolean updateStudentDetails(long id, float marks);
    public boolean deletestudentById(long id);

}
