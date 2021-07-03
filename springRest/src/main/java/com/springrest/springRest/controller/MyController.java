package com.springrest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springRest.entities.Courses;
import com.springrest.springRest.services.CourseService;

@RestController
public class MyController {
	 
	@Autowired
	private CourseService obj;
		
	@GetMapping("/home")
 public String hello() {
	 return "Hello Spring Boot";
 }
	//get the courses and map
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.obj.getCourses();
	}
	
	//to get single course
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.obj.getCourses(Long.parseLong(courseId));
		}
	
	@PostMapping("/courses")
	private Courses addCourse(@RequestBody Courses course) {
		return this.obj.addCourse(course);
	}
	//update api's in apringboot
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course) {
		return this.obj.updateCourses(course);
	}
	//delete api from springboot
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId) {
		try {
			this.obj.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
