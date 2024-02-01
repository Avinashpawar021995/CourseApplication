package com.spring.course.SpringCourse.enitity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private long  id;
	private String name;
	private String title;
	private String description;
	private Date startDate;
	public Course(long id, String name, String title, String description, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.description = description;
		 this.startDate=startDate;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", title=" + title + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
