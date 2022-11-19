package com.group_e.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group_e.school_management_system.dao.iCourseRepository;
import com.group_e.school_management_system.entity.Course;

@Controller
@RequestMapping("/course")
public class CourseController {
    
    @Autowired
    iCourseRepository courseRepository;
    
    @GetMapping("/add")
    public String displayCourseForm(Model model){
        model.addAttribute("course", new Course());
        return "course/add-course";
    }

    @PostMapping("/save")
    public String createCourse(Course course, Model model) {
        courseRepository.save(course);
        return "redirect:/course/add-course";
    }

    @GetMapping("/courses")
    public String displayCourses() {
        // List<Student> students = studentRepository.findAll();

        return "course/showCourses";
    }
}