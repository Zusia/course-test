package com.springrest.springRest.entities;

public class Courses {
	private long id;
	private String title;
	private String description;
	//generate constructors for all fields
	public Courses(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	//generate default constructor - Source-> generate constructor from SuperClass
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generate getters and setter - Source -> generate getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//generate toString from "Source" in menu bar.
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
		
	
	
	//all entities created
}
