package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group_e.school_management_system.entity.Course;

public interface iCourseRepository extends JpaRepository<Course, Long> {
    
    @Override
    List<Course> findAll();

    // @Query(value = "")
}
