package com.example.springservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springmodels.Course;

@Service
public class springserviceImpl implements CourseService {

	List<Course> list;
	public springserviceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(101,"Java","Java is Fabulous"));
		list.add(new Course(102,"C++","C++ is Fabulous"));
		
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course : list) {
			if(course.getId() == courseId)
			{
				c=course;
				break;
			}
		}
		return c;
		
			
	}

	@Override
	public Course addCourse(Course crse) {
		list.add(crse);
		return crse;
	}

	@Override
	public Course updateCourse(Course crse) {
//		list.forEach(element ->{
//			if(element.getId() == crse.getId()) {
//				element.setCourseName(crse.getCourseName());
//				element.setCourseDesc(crse.getCourseDesc());
//			}
//		});
		
		for(Course cr : list) {
			if(cr.getId() == crse.getId()) {
//				cr.setId(crse.getId());
				cr.setCourseName(crse.getCourseName());
				cr.setCourseDesc(crse.getCourseDesc());
			}
		}
		return crse;
	}

}
