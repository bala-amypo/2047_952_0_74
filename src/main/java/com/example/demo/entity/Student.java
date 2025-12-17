package com.example.demo.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private string name;
    private string  dept;
    private LocalDate dob;
    private float cgpa;
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public float getCgpa() {
        return cgpa;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public Student(long id, String name, String dept, float cgpa, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.dob = dob;
    }
    public Student(){ 

    }

}