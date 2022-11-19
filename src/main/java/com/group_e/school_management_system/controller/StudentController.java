package com.group_e.school_management_system.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group_e.school_management_system.dao.iStudentRepository;
import com.group_e.school_management_system.entity.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    iStudentRepository studentRepository;

    @GetMapping("/add")
    public String displayStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/add-student";
    }

    @PostMapping("/save")
    public String createStudent(Student student, Model model) {
        studentRepository.save(student);
        return "redirect:/student/add";
    }

    @GetMapping("/students")
    public String displayStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);

        return "student/showStudents";
    }
    
}
