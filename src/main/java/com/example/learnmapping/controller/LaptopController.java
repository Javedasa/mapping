package com.example.learnmapping.controller;

import com.example.learnmapping.model.Laptop;
import com.example.learnmapping.repository.LaptopRepository;
import com.example.learnmapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    private LaptopRepository laptopRepository;
    @PostMapping("addLaptop")
    public String addLaptop(@RequestBody Laptop laptop){
        laptopRepository.save(laptop);
        return "laptop added successfully";
    }
}
