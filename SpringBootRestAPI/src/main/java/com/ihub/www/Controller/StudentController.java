package com.ihub.www.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ihub.www.entity.Student;
import com.ihub.www.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService serv;
	
	
	//get all the students in my student table
	
	//url of postman  localhost:8080/students
	
	/*
	 * @GetMapping("/students") public List<Student>getAllStudents(){
	 * List<Student>students=serv.findAll();
	 * 
	 * return students; }
	 */
	
	@PostMapping("/addstudent")
	public Student postDetails(@RequestBody Student student) {
		return serv.saveDetailes(student);
		
	}
	
	@GetMapping("/getstudent")
	public List<Student> getDetails(){
		return serv.getAllDetails();
	}
	
	@PutMapping("/updatestudent")
	public Student studentUpdateDetails(@RequestBody Student student) {
		return serv.updateDetailes(student);
		
	}
	@DeleteMapping("/deletestudent/{rollNo}")
	public String deletefunction(@PathVariable int rollNo) {
		return serv.deleteStudent(rollNo);
		
	}
	
	

}
