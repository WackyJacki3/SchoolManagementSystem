package com.group_e.school_management_system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import java.util.List;

import javax.persistence.*;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "course_sequence")
    private long courseId;

    private String title;
    private String description;


	@ManyToMany(cascade = 
        {CascadeType.DETACH, 
        CascadeType.MERGE, 
        CascadeType.REFRESH, 
        CascadeType.PERSIST},
        fetch = FetchType.LAZY)
    @JoinTable(name="student_course", 
    joinColumns = @JoinColumn(name = "courseId"),
    inverseJoinColumns = @JoinColumn(name ="studentId"))
    List<Student> students;

	@ManyToMany(cascade = 
        {CascadeType.DETACH, 
        CascadeType.MERGE, 
        CascadeType.REFRESH, 
        CascadeType.PERSIST},
        fetch = FetchType.LAZY)
    @JoinTable(name="teacher_course", 
    joinColumns = @JoinColumn(name = "courseId"),
    inverseJoinColumns = @JoinColumn(name ="teacherId"))
    List<Teacher> teachers;

    // constructors
    public Course() {
    }

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // getters & setters
	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
