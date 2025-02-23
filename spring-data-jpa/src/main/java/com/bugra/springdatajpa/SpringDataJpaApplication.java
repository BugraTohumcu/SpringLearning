package com.bugra.springdatajpa;

import com.bugra.springdatajpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student student1 = context.getBean(Student.class);
		student1.setRollNo(101);
		student1.setName("Senem");
		student1.setMarks(100);

		Student student2 = context.getBean(Student.class);
		student2.setRollNo(102);
		student2.setName("Buğra");
		student2.setMarks(12);

		Student student3 = context.getBean(Student.class);
		student3.setRollNo(103);
		student3.setName("Sina");
		student3.setMarks(3);

		repo.save(student1);
		repo.save(student2);
		repo.save(student3);



		System.out.println(repo.findByMarksGreaterThan(50).getFirst().getName());

	}
}
