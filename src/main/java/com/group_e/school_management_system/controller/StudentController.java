package com.group_e.school_management_system.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.group_e.school_management_system.dao.iCourseRepository;
import com.group_e.school_management_system.dao.iStudentRepository;
import com.group_e.school_management_system.entity.Course;
import com.group_e.school_management_system.entity.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    iStudentRepository studentRepository;

    @Autowired
    iCourseRepository courseRepository;

    @GetMapping("/add")
    public String displayStudentForm(Model model) {
        model.addAttribute("student", new Student());
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "student/add-student";
    }

    @PostMapping("/save")
    public String createStudent(Student student, Model model) {
        studentRepository.save(student);
        return "redirect:/student/add";
    }

    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable("id") String studentId, Model model) {
        Student student = studentRepository.findById(Long.parseLong(studentId));
        model.addAttribute("student", student);
        // model.addAttribute("student", new Student());
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "student/edit-student";
    }


    @PostMapping("/edit/save")
    public String saveEditStudent(Student student, Model model) {
        studentRepository.save(student);
        return "redirect:/student/showStudents";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable("id") String studentId, Boolean shouldDelete, Model model) {
        studentRepository.deleteById(Long.parseLong(studentId));
        return "redirect:/student/showStudents";
    }

    @GetMapping("/showStudents")
    public String displayStudents(Model model) throws JsonProcessingException {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "student/show-students";
    }

    @GetMapping("/showCourseStudents/{id}")
    public String displayCourseStudents(@PathVariable("id") String courseId, Model model) {
        Course courses = courseRepository.findById(Long.parseLong(courseId));
        model.addAttribute("courses", courses);
        List<Student> students = courses.getStudents();
        model.addAttribute("students", students);
        return "student/show-courseStudents";
    }

    /* @GetMapping("/add")
    public String displayStudentForm(Model model) {
        model.addAttribute("student", new Student());
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "student/add-student";
    } */

    // edit a student's info
    // @GetMapping("/students/edit/{studentId}")
    // public String editStudent(@PathVariable("studentId") Student studentId, Model model) {
    //     Student student = studentRepository.getStudentById(studentId);
    //     model.addAttribute("student", student);

    //     return "student/edit-student";
    // }
    // @GetMapping("/showStudents/edit")
    // public String editStudent() {
    //     return "student/edit-student";
    // }



    // update a student's info
    // @PostMapping("students/edit/UpdateStudent")
    // public String UpdateStudent(@ModelAttribute Student student, Model model, HttpSession session){
    //     // studentRepository.addStudent(student);

    //     model.addAttribute("newStudent", new Student());
    //     session.setAttribute("msg","Student Added Sucessfully...");

    //     return "StudentAdd";
    // }
    

    // delete a student
    // @GetMapping("/Studentshow/delete/{ID}")
    // public String deleteStudent(@PathVariable("ID") Long ID, HttpSession session) {
    //     studentSer.deleteByStudentId(ID);
    //     session.setAttribute("msg", "The User ID " + ID + " Deleted Succesfully");

    //     return "redirect:/Studentshow";
    // }
    
}
