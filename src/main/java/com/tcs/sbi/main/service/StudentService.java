package com.tcs.sbi.main.service;

import com.tcs.sbi.main.entity.Student;

public interface StudentService {
	void findById(Integer id);
	String addStudent(Student student);
}
