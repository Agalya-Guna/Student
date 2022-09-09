package com.mindtree.list.service;

import java.util.List;
import com.mindtree.list.entity.Student;

public interface StudentService {

	List<Student> putStudents();
	List<Student> getAll();
	Student getById(int id);
}
