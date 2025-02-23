package com.bugra.studentAppPractise.StudentApp.controller;

import com.bugra.studentAppPractise.StudentApp.model.Student;
import com.bugra.studentAppPractise.StudentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {


    StudentService studentService;
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<>(studentService.getAll() , HttpStatus.OK);
    }



    @PostMapping("/add")
    public ResponseEntity<String> addStudent(Student student , MultipartFile imageFile){
        try {
             studentService.addStudent(student, imageFile);
             return new ResponseEntity<>("Added", HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id){

        return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable int id){
       Optional<Student> student = studentService.getStudent(id);
       if(student!=null){
           studentService.deleteStudent(id);
           return new ResponseEntity<>("Deleted",HttpStatus.OK);
       }
       return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
    }
}
