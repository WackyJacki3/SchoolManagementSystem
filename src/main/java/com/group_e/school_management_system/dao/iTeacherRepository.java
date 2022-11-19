package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group_e.school_management_system.entity.Teacher;

public interface iTeacherRepository extends JpaRepository<Teacher, Long> {
    
    @Override
    public List<Teacher> findAll();

    // @Query(value = "")
}
