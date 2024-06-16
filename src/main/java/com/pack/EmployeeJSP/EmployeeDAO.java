package com.pack.EmployeeJSP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	static List<EmployeeConfig> employees = new ArrayList<EmployeeConfig>();
	
	static {
		employees.add(new EmployeeConfig(1L, "Ram Kumar", 28, "HR", 45000.0));
		employees.add(new EmployeeConfig(2L, "Shiva Kokkonda", 34, "Admin", 51000.0));
		employees.add(new EmployeeConfig(3L, "Ravi Varma", 60, "IT", 28000.0));
		employees.add(new EmployeeConfig(4L, "Charan Teja", 45, "HR", 39000.0));
		employees.add(new EmployeeConfig(5L, "Mahesh Babu", 38, "Admin", 23000.0));
		employees.add(new EmployeeConfig(6L, "Natraj Rao", 42, "Sales", 36000.0));
	}
	
	public List<EmployeeConfig> getList(){
		return employees;
	}

}
