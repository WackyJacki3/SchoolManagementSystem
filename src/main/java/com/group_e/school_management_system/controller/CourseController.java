package com.group_e.school_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.group_e.school_management_system.dao.iCourseRepository;
import com.group_e.school_management_system.entity.Course;
import com.group_e.school_management_system.entity.Student;

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
        return "redirect:/course/add";
    }

    @GetMapping("/edit/{id}")
    public String editCourseForm(@PathVariable("id") String courseId, Model model) {
        Course course = courseRepository.findById(Long.parseLong(courseId));
        model.addAttribute("course", course);
        return "course/edit-course";
    }

    @PostMapping("/edit/save")
    public String saveEditCourse(Course course, Model model) {
        courseRepository.save(course);
        return "redirect:/course/showCourses";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable("id") String courseId, Model model) {
        courseRepository.deleteById(Long.parseLong(courseId));
        return "redirect:/course/showCourses";
    }

    @GetMapping("/showCourses")
    public String displayCourses(Model model) throws JsonProcessingException {
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "course/show-courses";
    }

    @GetMapping("/showCourse/{id}")
    public String displayCourse(@PathVariable("id") String courseId, Model model) {
        Course course = courseRepository.findById(Long.parseLong(courseId));
        model.addAttribute("course", course);
        return "course/show-course";
    }
}