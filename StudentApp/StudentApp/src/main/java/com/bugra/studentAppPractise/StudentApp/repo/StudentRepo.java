package com.bugra.studentAppPractise.StudentApp.repo;

import com.bugra.studentAppPractise.StudentApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
