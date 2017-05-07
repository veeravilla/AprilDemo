package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.jaxb.Student;

@Controller
public class RestController {
	
	@RequestMapping(method=RequestMethod.GET,value="/student/{sno}") //READ
	public @ResponseBody Student getStudent(@PathVariable int sno){
		//JDBC Code
		return new Student(sno, "Jhon", "MS");
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student") //Save /Insert
	public @ResponseBody Student saveStudent(@RequestBody Student student){
		//JDBC Code
		return student;
	}
}
