package com.group_e.school_management_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "course_sequence")
    private long courseId;

    private String courseTitle;
    private String courseDescription;
    
    // constructors
    public Course() {
    }

    public Course(String courseTitle, String courseDescription) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
    }

    // getters & setters
    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    
}
