package com.example.springmodels;

//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name="TBL_EMPLOYEES") -- For manual table name in database
public class Course {

	@Id
//	@GeneratedValue -- for Auto Generated value auto increment
	private long id;
	
//	@Column(name = "courseName") -- for the manual column name
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
