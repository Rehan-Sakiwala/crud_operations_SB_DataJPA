package com.demo.SBDataJPADemo.repository;

import com.demo.SBDataJPADemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
