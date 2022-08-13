package com.example.springcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmodels.Course;
import com.example.springservices.CourseService;

//First Video Done
//Second Video Update -- Completed

//Represenational State Transfer -- To create and send JSON Data
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class myController {
	
	@Autowired
	CourseService myCourses;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return myCourses.getCourses();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return myCourses.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course crse) {
		return myCourses.addCourse(crse);	
	}
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course crse) {
		return myCourses.updateCourse(crse);
	}
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			myCourses.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
}
