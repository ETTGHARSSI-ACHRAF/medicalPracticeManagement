package com.cabinetmedical.cabimed.controller;

import com.cabinetmedical.cabimed.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1,"achraf","ettgharssi");
        //return new  ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok(student);
    }


    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getListeStudent(){
        Student student = new Student(1,"achraf","ettgharssi");
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(new Student(2,"yassine", "elhoubi"));
        return students;
    }

    //http://localhost:8080/student/1
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student = new Student(id,"achraf","ettgharssi");
        return student;
    }

    //http://localhost:8080/student/12/youssef/ettgharssi
    @GetMapping("/student/{id}/{fName}/{lName}")
    public Student getStudentByAllData(@PathVariable int id, @PathVariable("fName") String firstName, @PathVariable("lName") String lastName){
        Student student = new Student(id,firstName,lastName);
        return student;
    }

    //http://localhost:8080/studentById?id=5
    @GetMapping("/studentById")
    public Student getStudentByAllData(@RequestParam int id){
        Student student = new Student(id,"achraf","ettgharssi");
        return student;
    }

    //http://localhost:8080/studentById?id=5&fName=achraf
    @GetMapping("/studentByIdAndName")
    public Student getStudentByIdAndName(@RequestParam int id, @RequestParam String fName){
        Student student = new Student(id,fName,"ettgharssi");
        return student;
    }

    @PostMapping("student/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student){
        return student;
    }

    @PutMapping("student/updated")
    public Student updateStudent(@RequestBody Student student){
        return student;
    }

    @DeleteMapping("student/deleted")
    public boolean deleteStudent(@RequestParam int id){
        return true;
    }
}
