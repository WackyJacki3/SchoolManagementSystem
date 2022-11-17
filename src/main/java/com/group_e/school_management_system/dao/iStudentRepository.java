package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.group_e.school_management_system.entity.Student;

public interface iStudentRepository extends CrudRepository<Student, Long>{

    @Override
    public List<Student> findAll();
}