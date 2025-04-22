package com.nitin.springJPA;

import com.nitin.springJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);


		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollno(101);
		s1.setName("Amar");
		s1.setMarks(76);

		s2.setRollno(102);
		s2.setName("Jatin");
		s2.setMarks(80);

		s3.setRollno(103);
		s3.setName("Shashi");
		s3.setMarks(90);

		//for updating
		s4.setRollno(103);
		s4.setName("Shashi");
		s4.setMarks(100);

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Amar"));
//		System.out.println(repo.findByMarksGreaterThan(79));

		repo.save(s4);
		repo.delete(s2);
	}

}
