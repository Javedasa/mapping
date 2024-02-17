package com.example.learnmapping.controller;

import com.example.learnmapping.model.Laptop;
import com.example.learnmapping.model.Student;
import com.example.learnmapping.repository.LaptopRepository;
import com.example.learnmapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonEndPoints {
    @Autowired
    private LaptopRepository laptopRepository;
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("studentMapping")
    public String studentMapping(@RequestParam int laptopId,@RequestParam int studentId){
      Student student=studentRepository.findById(studentId).get();
      Laptop laptop=laptopRepository.findById(laptopId).get();
      student.setLaptop(laptop);
        studentRepository.save(student);
        return "mapped successfully";
    }
}
