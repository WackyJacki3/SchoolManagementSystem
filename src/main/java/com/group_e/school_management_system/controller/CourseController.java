package com.group_e.school_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group_e.school_management_system.entity.Course;

@Controller
@RequestMapping("/course")
public class CourseController {
    
    @GetMapping("/new")
    public String displayCourse(Model model){
        model.addAttribute("course", new Course());
        return "course/course";
    }

}
