package com.group_e.school_management_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "instructor_sequence")
    private long teacherId;

    private String teacherFirstName;
    private String teacherLastName;
    private String teacherPhoneNumber;
    private String teacherEmail;

    // constructors
    public Teacher() {
    }

    public Teacher(String teacherFirstName, String teacherLastName, String teacherPhoneNumber, String teacherEmail) {
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.teacherEmail = teacherEmail;
    }

    // getters & setters
    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public void setTeacherPhoneNumber(String teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    
    
}
