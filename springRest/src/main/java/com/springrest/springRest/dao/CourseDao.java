package com.springrest.springRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springRest.entities.Courses;
public interface CourseDao extends JpaRepository <Courses,Long>{
 
}
