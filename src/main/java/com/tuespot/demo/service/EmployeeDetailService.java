package com.tuespot.demo.service;

import java.util.List;

import javax.validation.Valid;

import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.model.EmployeeDetailsModel;

public interface EmployeeDetailService {
	public EmployeeDetailsModel createEmployeeDetails (@Valid EmployeeDetailsModel employeeDetailsModel);
	public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetail);
	public List<EmployeeDetails>getEmployeeDetails();
	public String deleteEmployee(Long id) ;
	
	
	

}
