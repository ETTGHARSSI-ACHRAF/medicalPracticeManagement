package com.cabinetmedical.cabimed.controller;

import com.cabinetmedical.cabimed.bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1,"achraf","ettgharssi");
        return student;
    }

    @GetMapping("/students")
    public List<Student> getListeStudent(){
        Student student = new Student(1,"achraf","ettgharssi");
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(new Student(2,"yassine", "elhoubi"));
        return students;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student = new Student(id,"achraf","ettgharssi");
        return student;
    }
    @GetMapping("/student/{id}/{fName}/{lName}")
    public Student getStudentByAllData(@PathVariable int id, @PathVariable("fName") String firstName, @PathVariable("lName") String lastName){
        Student student = new Student(id,firstName,lastName);
        return student;
    }
}
