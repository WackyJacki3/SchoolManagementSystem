package com.group_e.school_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.group_e.school_management_system.dao.iCourseRepository;
import com.group_e.school_management_system.entity.Course;

@Controller
public class HomeController {
    
    @Autowired
    iCourseRepository courseRepository;

    @GetMapping("/")
    public String displayHome(Model model) {
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "home/index";
    }
}
