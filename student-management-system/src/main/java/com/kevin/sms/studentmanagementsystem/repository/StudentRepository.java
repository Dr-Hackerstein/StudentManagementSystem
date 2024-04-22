package com.kevin.sms.studentmanagementsystem.repository;

import com.kevin.sms.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
