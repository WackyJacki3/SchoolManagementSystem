package com.group_e.school_management_system.entity;

import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.SequenceGenerator;
import javax.persistence.*;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_sequence")
    private long studentId;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    

    @ManyToMany(cascade = 
        {CascadeType.DETACH, 
        CascadeType.MERGE, 
        CascadeType.REFRESH, 
        CascadeType.PERSIST},
        fetch = FetchType.LAZY)
    @JoinTable(name="student_course", 
    joinColumns = @JoinColumn(name = "studentId"),
    inverseJoinColumns = @JoinColumn(name ="courseId"))
    private List<Course> courses;


    // constructors
    public Student() {
    }

    public Student(String firstName, String lastName, String phoneNumber, String email, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.courses = courses;
    }


    public long getStudentId() {
        return studentId;
    }


    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    // @Override
    // public String toString(){
    //     return firstName + " " + lastName;
    // }
}
