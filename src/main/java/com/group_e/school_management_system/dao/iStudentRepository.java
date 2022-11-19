package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group_e.school_management_system.entity.Student;

public interface iStudentRepository extends JpaRepository<Student, Long>{

    @Override
    public List<Student> findAll();
}