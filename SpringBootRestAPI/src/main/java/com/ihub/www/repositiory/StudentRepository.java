package com.ihub.www.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihub.www.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
