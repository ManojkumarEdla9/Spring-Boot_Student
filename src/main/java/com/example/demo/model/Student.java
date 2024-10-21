package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="students")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private int age;
private String grades;
private String name;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="Students_courses",
				joinColumns=@JoinColumn(name="student_id",referencedColumnName="id"),
				inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="id"))
	private Set<Course>courses;

}
