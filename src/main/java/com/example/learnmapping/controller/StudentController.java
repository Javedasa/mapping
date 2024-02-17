package com.example.learnmapping.controller;

import com.example.learnmapping.model.*;
import com.example.learnmapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}
