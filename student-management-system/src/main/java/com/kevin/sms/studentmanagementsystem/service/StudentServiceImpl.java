package com.kevin.sms.studentmanagementsystem.service;

import com.kevin.sms.studentmanagementsystem.entity.Student;
import com.kevin.sms.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Autowired

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
