package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository; //constructor base dependency
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();  //list of student
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void  deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
