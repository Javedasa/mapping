package com.example.learnmapping.service;

import com.example.learnmapping.model.Student;
import com.example.learnmapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student) {
          studentRepository.save(student);
        return "student added succesfully";
    }
}
