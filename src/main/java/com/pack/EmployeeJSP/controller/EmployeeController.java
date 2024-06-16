package com.pack.EmployeeJSP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pack.EmployeeJSP.EmployeeDAO;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@GetMapping("/employees")
	public String getEmployees(Model m) {
		m.addAttribute("object",employeeDAO.getList());
		return "index";
	}

}
