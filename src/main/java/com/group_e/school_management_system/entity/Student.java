package com.group_e.school_management_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_sequence")
    private long studentId;

    private String studentFirstName;
    private String studentLastName;
    private String studentPhoneNumber;
    private String studentEmail;

    // constructors
    public Student() {
    }

    public Student(String studentFirstName, String studentLastName, String studentPhoneNumber, String studentEmail) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentEmail = studentEmail;
    }

    // getters & setters
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

}
