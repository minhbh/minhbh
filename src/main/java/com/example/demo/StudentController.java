package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/")
public class StudentController {
@RequestMapping("bean")
public String bean(ModelMap model) {
	Student s = new Student("Nguyen Van An",7.5,"APP");
	model.addAttribute("student",s);
	return "student/bean";
}
}
