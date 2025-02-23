package com.bugraT.demo.JDBC;

import com.bugraT.demo.JDBC.model.Student;
import com.bugraT.demo.JDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoJdbcApplication.class, args);

		Student student = context.getBean(Student.class);

		student.setName("Senem");
		student.setMarks(100);
		student.setRollNo(101);


		StudentService service = context.getBean(StudentService.class);
		//service.addStudent(student);
		System.out.println(service.fetchAll());
	}

}
