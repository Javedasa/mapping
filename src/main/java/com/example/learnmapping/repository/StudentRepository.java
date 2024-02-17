package com.example.learnmapping.repository;

import com.example.learnmapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
}
