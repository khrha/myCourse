package com.ipg.myCourse.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ipg.myCourse.model.Course;
import com.ipg.myCourse.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		System.out.println("===> retrieveCoursesForStudent");
		return studentService.retrieveCourses(studentId);
	}
		
}
