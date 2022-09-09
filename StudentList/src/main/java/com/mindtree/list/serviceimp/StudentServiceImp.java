package com.mindtree.list.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindtree.list.entity.Student;
import com.mindtree.list.service.StudentService;
@Component
@Service
public class StudentServiceImp implements StudentService{

	private static List<Student> stud = new ArrayList<>();
	
	public  StudentServiceImp() {
		stud=putStudents();
	}
	@Override
	public List<Student> putStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Ross", 80));
		list.add(new Student(102, "Rachel", 90));
		list.add(new Student(103, "Monica", 56));
		list.add(new Student(104, "Chandler", 67));
		list.add(new Student(105, "Joey",54));
		list.add(new Student(106, "Phoebe",89));
		list.add(new Student(107, "Klaus",73));
		list.add(new Student(108, "Hope",81));
		list.add(new Student(109, "Hailey",87));
		list.add(new Student(110, "Harrys",98));
		return list;
	}

	@Override
	public List<Student> getAll() {
		return stud;
	}

	@Override
	public Student getById(int id) {
		return stud.stream().filter(x -> x.getId() == id).findFirst().get();
	}

}
