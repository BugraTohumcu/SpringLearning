package com.bugra.studentAppPractise.StudentApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{
        @Id
        int Id;
        String name;
        String department;
        String imageType;
       String imageName;
       byte[] imageData;
}
