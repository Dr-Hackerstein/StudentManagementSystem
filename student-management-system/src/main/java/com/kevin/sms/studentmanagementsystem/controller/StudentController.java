package com.kevin.sms.studentmanagementsystem.controller;

import com.kevin.sms.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle list student and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students",studentService.getAllStudents());

        return "students";
    }
}