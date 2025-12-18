package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import java.util.*;

@RestController


public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/getall")
    public List<Student> getallstudent(){
        return stdser.getallstudents();
    }
    @GetMapping("getById(id)")
    public optional<student>getId(@PathVariable Long id){
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
    public string update {@PathVariable Long id, @RequestBody Student st}{
        return stdser.updateData(id ,st);
    }

}