package com.group_e.school_management_system.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.group_e.school_management_system.entity.Student;

@Repository
public interface iStudentRepository extends CrudRepository<Student, Long>{

    @Override
    public List<Student> findAll();

    public void deleteById(long id);

    public List<Student> save(long id);
    
    // public List<Student> findAllById(long id);
    
    public Student findById(long id);

    /* private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email; */

    // public Student getStudentById(Student studentId);

    // @Query(nativeQuery = true, value = "SELECT e.title as title, e.teacherName as teacherName, " +
    // "COUNT(pe.courseName_id) as countofcourse " +
    // "FROM employee e " +
    // "LEFT JOIN project_employee pe " +
    // "ON e.employee_id = pe.employee_id " +
    // "GROUP BY e.first_name, e.last_name " +
    // "ORDER BY 3 DESC;")
    // public List<CourseList> employeeProjects();
}