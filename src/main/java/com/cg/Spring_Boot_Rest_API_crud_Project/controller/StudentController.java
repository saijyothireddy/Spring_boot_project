package com.cg.Spring_Boot_Rest_API_crud_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Spring_Boot_Rest_API_crud_Project.entity.Student;
import com.cg.Spring_Boot_Rest_API_crud_Project.service.StudentService;

@RestController
public class StudentController {
	@Autowired
StudentService service;
	@GetMapping("/students")
	public List<Student>getAll(){
		return service.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable int id) {
	 return service.getStudentById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	@PutMapping("/update/{id}")
	public Student update(@RequestBody Student student,@PathVariable int id) {
		return service.updateStudent(student, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
