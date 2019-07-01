package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Address;
import com.app.entity.Employee;
import com.app.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public int saveEmployeeDetails(String empName, String empAddr) {

		Employee e1 = new Employee();
		e1.setName(empName);
		e1.setEmail("ravi@gmail.com");

		Address address1 = new Address();
		address1.setAddressLine1("G-21,Lohia nagar");
		address1.setCity(empAddr);
		address1.setState("UP");
		address1.setCountry("India");
		address1.setPincode(201301);

		e1.setAddress(address1);
		address1.setEmployee(e1);
		employeeRepo.save(e1);
		System.out.println("Saved Successfully");
		return 0;
	}

}
