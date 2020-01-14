package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeyController {

	@Autowired
	private StudentDAO stdao;
	
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> hello(Student s) {
		return stdao.findAll();
	}
	
	@RequestMapping("/student/{rollno}")
	@ResponseBody
	public Optional<Student> hey(@PathVariable("rollno") String a) {
		return stdao.findByRollno(a);
	}

}
