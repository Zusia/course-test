package com.springrest.springRest.services;

import java.util.List;

import com.springrest.springRest.entities.Courses;


public interface CourseService {
	public List<Courses> getCourses();   //; here since we cannot give any body inside interface
	public Courses getCourses(long courseId);
	public Courses addCourse(Courses course);
	public Courses updateCourses(Courses course);
	public void deleteCourses(long parseLong);
}
