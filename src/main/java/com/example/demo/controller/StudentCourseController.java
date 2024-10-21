package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Service.StudentCourseService;
import com.example.demo.model.Course;
import com.example.demo.model.Student;

public class StudentCourseController {
private final StudentCourseService service;
public StudentCourseController(StudentCourseService service)
{
	this.service=service;
}
@GetMapping("/students")
public List<Student>getAllStudents()
{
	return service.findAllStudents();
}
@GetMapping("/courses")
public List<Course>getAllCourses()
{
	return service.findAllCourses();
}
@PostMapping("/students")
public Student createStudent(@RequestBody Student student)
{
	return service.saveStudent(student);
}
@PostMapping("/courses")
public Course createCourse(@RequestBody Course course)
{
	return service.saveCourse(course);
	}
}
