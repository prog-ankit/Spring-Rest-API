package com.example.springservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdao.courseDao;
import com.example.springmodels.Course;

@Service
public class springserviceImpl implements CourseService {

	@Autowired
	private courseDao coursedao;

	public springserviceImpl() {

	}

	@Override
	public List<Course> getCourses() {
		return coursedao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return coursedao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse(Course crse) {
		System.out.println(crse.toString());
		return coursedao.save(crse);
	}

	@Override
	public Course updateCourse(Course crse) {
		return coursedao.save(crse);
	}

	@Override
	public void deleteCourse(long courseId) {
		Course cr = coursedao.getReferenceById(courseId);
		coursedao.delete(cr);
	}

}
