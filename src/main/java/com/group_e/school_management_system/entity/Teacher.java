package com.group_e.school_management_system.entity;

import java.util.List;

// import javax.persistence.CascadeType;
// import javax.persistence.Entity;
// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
// import javax.persistence.SequenceGenerator;
import javax.persistence.*;


@Entity
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "teacher_sequence")
    private long teacherId;

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
    @JoinTable(name="teacher_course", 
        joinColumns = @JoinColumn(name = "teacherId"),
        inverseJoinColumns = @JoinColumn(name ="courseId"))
    List<Course> courses;

    // constructors
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String phoneNumber, String email, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.courses = courses;
    }

    // getters & setters
    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
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
    
    @Override
    public String toString(){
        return firstName + "" + lastName;
    }
}