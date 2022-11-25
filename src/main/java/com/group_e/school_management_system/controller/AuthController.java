package com.group_e.school_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.group_e.school_management_system.dao.iAuthRepository;
import com.group_e.school_management_system.entity.User;

@Controller
public class AuthController {

    @Autowired
    iAuthRepository authRepository;

    @GetMapping("/")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "auth/login";
    }

    @GetMapping("/register")
    public String showRegister(Model model) {
        model.addAttribute("user", new User());
        return "auth/register";
    }

    @PostMapping("/")
    public String handleLogin(User user, Model model) {
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(authRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null);
        if (authRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null) {
            return "redirect:/home";
        } else {
            return "redirect:/";
        }

    }

    @PostMapping("/register")
    public String handleRegister(User user, Model model) {

        if (user.getFullName() != null && user.getEmail() != null && user.getPassword() != null) {
            authRepository.save(user);
            return "redirect:/home";
        } else {
            return "redirect:/register";
        }

    }
}
