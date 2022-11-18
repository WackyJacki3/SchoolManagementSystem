package com.group_e.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group_e.school_management_system.dao.iTeacherRepository;
import com.group_e.school_management_system.entity.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    iTeacherRepository teacherRepository;
    
    @GetMapping("/add")
    public String displayInstructorForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacher/add-teacher";
    }

    @PostMapping("/save")
    public String createTeacher(Teacher teacher, Model model) {
        teacherRepository.save(teacher);
        return "redirect:/teacher/add";
    }

    @GetMapping("/teachers")
    public String displayTeachers() {
        // List<Teacher> teachers = teacherRepository.findAll();

        return "teacher/showTeachers";
    }

    
}