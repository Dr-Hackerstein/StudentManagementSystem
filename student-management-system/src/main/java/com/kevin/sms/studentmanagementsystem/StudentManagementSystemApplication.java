package com.kevin.sms.studentmanagementsystem;

import com.kevin.sms.studentmanagementsystem.entity.Student;
import com.kevin.sms.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Alexia", "Otero", "alexiamorales11109@gmail.com");
//		Student student2 = new Student("Liliana", "Morales", "liliana@gmail.com");
//		Student student3 = new Student("Maura", "Morales", "maura@gmail.com");
//
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
	}
}
