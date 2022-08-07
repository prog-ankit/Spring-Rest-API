package com.example.springmodels;

public class Course {

	private long id;
	private String courseName;
	private String courseDesc;

	public Course() {
		super();
	}

	public Course(long id, String courseName, String courseDesc) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseDesc=" + courseDesc + "]";
	}

		
}
