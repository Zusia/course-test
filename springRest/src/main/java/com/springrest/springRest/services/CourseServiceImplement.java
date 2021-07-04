package com.springrest.springRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springRest.dao.CourseDao;
import com.springrest.springRest.entities.Courses;


@Service
public class CourseServiceImplement implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourses(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourses(long entity) {
		// TODO Auto-generated method stub
		// to load entity to the database we use getOne()
		Courses Entity1 = courseDao.getOne(entity);
		courseDao.delete(Entity1);
	}

}
