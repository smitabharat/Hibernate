package com.hefshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hefshine.beans.Student;
import com.hefshine.dao.Studentdao;

public class AppController {
	@RequestMapping("/")
	public String welcomePage(ModelMap map) {
		map.addAttribute("message", "good morning");
		return "welcome";
	}

	@RequestMapping("/profile")
	public String profilePage(ModelMap map) {

		map.addAttribute("student", new Student(101, "Smita", "Bharat"));

		return "profile";
	}
	
	
	@RequestMapping("/myprofile")
	public String myprofilePage() {

	

		return "myprofile";
	}
	
	

	@RequestMapping("/myForm")
	public String myForm() {

		return "myForm";
	}
	
	@Autowired
	private Studentdao sd;

	@RequestMapping("/submitAction")
	public String submitAction(@RequestParam("rollno") int RollNo) {

		
		System.out.println("Hello " + RollNo);
		Student s=sd.getById(RollNo);
		System.out.println(s);

		return "redirect:/myForm";
	}

}
