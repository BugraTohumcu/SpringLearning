package com.bugraT.demo.JDBC.service;

import com.bugraT.demo.JDBC.model.Student;
import com.bugraT.demo.JDBC.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public  void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> fetchAll() {
        return repo.getStudent();
    }

    public void remove(String name){
        repo.delete(name);
    }
}
