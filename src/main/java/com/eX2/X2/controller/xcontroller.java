package com.eX2.X2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eX2.X2.entity.Employee;
import com.eX2.X2.service.EmpService;





@Controller
public class xcontroller {

	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<Employee>emp =service.getAllEmp();
		m.addAttribute("emp",emp);
		return "index";
	}
	@GetMapping("add-emp")
	public String addEmpForm()
	{
		return "add_emp";
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		
		System.out.println(e);
		service.addEmp(e);
		
		return "redirect:/";
		
	}
	@GetMapping("/edit/{id}")
	public String Edit(@PathVariable int id , Model m)
	
	
	{
		Employee e =service.getEmpbyId(id);
		m.addAttribute("emp",e);
		
		return "Edit";
	}
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e)
	{
		service.addEmp(e);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String DeleteEmp(@PathVariable int id)
	{
		service.deleteEmp(id);
		
		return "redirect:/";
	}
}
