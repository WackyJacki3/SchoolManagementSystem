package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.group_e.school_management_system.entity.Teacher;

public interface iTeacherRepository extends CrudRepository<Teacher, Long> {
    
    @Override
    public List<Teacher> findAll();
    
    public void deleteById(long id);
    // @Query(value = "")
}
