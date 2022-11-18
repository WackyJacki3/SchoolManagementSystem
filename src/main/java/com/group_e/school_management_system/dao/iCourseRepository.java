package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.group_e.school_management_system.entity.Course;

public interface iCourseRepository extends CrudRepository<Course, Long> {
    
    @Override
    public List<Course> findAll();

    // @Query(value = "")
}
