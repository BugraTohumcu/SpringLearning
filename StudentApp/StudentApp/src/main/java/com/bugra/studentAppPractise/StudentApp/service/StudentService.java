package com.bugra.studentAppPractise.StudentApp.service;

import com.bugra.studentAppPractise.StudentApp.model.Student;
import com.bugra.studentAppPractise.StudentApp.repo.StudentRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {



    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAll(){
        return studentRepo.findAll();
    }



    public void addStudent(Student student, MultipartFile imageFile) throws IOException {
        student.setImageName(imageFile.getName());
         student.setImageType(imageFile.getContentType());
        student.setImageData(imageFile.getBytes());

         studentRepo.save(student);

    }

    public Optional<Student> getStudent(int id) {
        return studentRepo.findById(id);
    }

    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
