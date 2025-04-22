package com.nitin.springjdbc;

import com.nitin.springjdbc.model.Student;
import com.nitin.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollno(96);
		s.setName("Nitin");
		s.setMarks(68);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();

		System.out.println(students);
	}

}
