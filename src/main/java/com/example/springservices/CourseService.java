package com.example.springservices;

import java.util.List;

import com.example.springmodels.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course crse);
	public Course updateCourse(Course crse);
	public void deleteCourse(long courseId);
}
