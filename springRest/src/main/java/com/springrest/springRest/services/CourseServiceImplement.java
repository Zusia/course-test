package com.springrest.springRest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springRest.entities.Courses;


@Service
public class CourseServiceImplement implements CourseService {

	List<Courses> list;
	CourseServiceImplement(){
		list=new ArrayList<>();
		list.add(new Courses(120,"Core Java","This is Core Java Basics"));
		list.add(new Courses(121,"Advanced Java","This is advanced java"));
		list.add(new Courses(122,"SpringBoot","Creating Rest API using SpringBoot"));
	}
	@Override
	public List<Courses> getCourses() {
		return list;
	}
	@Override
	public Courses getCourses(long courseId) {
		Courses c=null;
		for(Courses c1:list) {
			if(c1.getId() == courseId) {
				c=c1;
				break;
			}
		}
		return c;
	}
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	@Override
	public Courses updateCourses(Courses course) {
		// TODO Auto-generated method stub
		list.forEach(e->{			
		if(e.getId() == course.getId()){
			e.setTitle(course.getTitle());
			e.setDescription(course.getDescription());
		}			
		});
		return course;
	}
	@Override
	public void deleteCourses(long parseLong) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e->e.getId()!= parseLong).collect(Collectors.toList());		
	}
}
