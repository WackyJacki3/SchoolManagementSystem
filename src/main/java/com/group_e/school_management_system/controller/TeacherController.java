package com.group_e.school_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
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

    @GetMapping("/showTeachers")
    public String displayTeachers(Model model) throws JsonProcessingException {
        List<Teacher> teachers = teacherRepository.findAll();
        model.addAttribute("teachers", teachers);

        return "teacher/show-teachers";
    }


    // edit a teacher's info
    // @GetMapping("/teachers/edit/{teacherId}")
    // public String editStudent(@PathVariable("teacherId") Teacher teacherId, Model model) {
    //     Teacher teacher = teacherRepository.getTeacherById(teacherId);
    //     model.addAttribute("teacher", teacher);

    //     return "teacher/edit-teacher";
    // }
    @GetMapping("/showTeachers/edit")
    public String editTeacher() {
        return "teacher/edit-teacher";
    }

}