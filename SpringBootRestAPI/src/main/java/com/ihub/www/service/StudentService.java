package com.ihub.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ihub.www.entity.Student;
import com.ihub.www.repositiory.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	public Student saveDetailes(Student student) {
		return repo.save(student);
		
	}

	public List<Student> getAllDetails() {
		return repo.findAll();
	}
	
	public Student updateDetailes(Student student) {
		Student updatestudent= repo.findById(student.getRollNo()).orElse(null);
		if(updatestudent!=null) {
			
			updatestudent.setPercentage(student.getPercentage());
			
			updatestudent.setName(student.getName());
			
			repo.save(updatestudent);
			return updatestudent;
			
		
			
		
			
		}
		return updatestudent;
	}
	

	public String deleteStudent(int rollNo) {
		if(repo.existsById(rollNo)) {
		repo.deleteById(rollNo);
		return "deleted"  +rollNo;
	}else {
		return "id not there in rest API";
	}
		
	}


}
