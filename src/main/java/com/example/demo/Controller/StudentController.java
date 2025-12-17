package com.example.demo.controller;
import org.springframework.web.bind.annotation.*; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.PostStudent;
import org.springframework.beans.factory.annotation.StudentController;



import com.example.demo.entity.Studednt

@RestController


public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }


}