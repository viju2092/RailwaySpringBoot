package org.railwayspringboot.controller;

import java.util.*;

import org.railwayspringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value="/empdata", method=RequestMethod.GET)
	public List<Employee> employeedata() {
		
	 List<Employee> emplist = new ArrayList<Employee>();
	 emplist.add(new Employee(1,"Abhishek","Gupta","abhigup@gmail.com"));
	 emplist.add(new Employee(2,"Rakesh","Sharma","rakshar@gmail.com"));
	 emplist.add(new Employee(3,"Harish","Raghavan","harishraghav@gmail.com"));
	 emplist.add(new Employee(4,"Ajith","Kumar","thala@gmail.com"));
	 return emplist;
	}
}
