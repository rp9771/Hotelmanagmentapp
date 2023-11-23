package com.tuespot.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.Repo.EmployeeDetailRepository;
import com.tuespot.demo.model.EmployeeDetailsModel;
import com.tuespot.demo.service.EmployeeDetailService;

@Service
public  class EmployeeDetailServiceImpl implements EmployeeDetailService {
	
	   @Autowired
	    private EmployeeDetailRepository employeeDetailRepository;

		
		
		@Override
		public EmployeeDetailsModel createEmployeeDetails(EmployeeDetailsModel employeeDetailsModel) {
			EmployeeDetails employeeDetails=new EmployeeDetails();
			
			employeeDetails.setEmpName(employeeDetailsModel.getEmpName());
			employeeDetails.setEmapEmail(employeeDetailsModel.getEmapEmail());
			employeeDetails.setEmpSalary(employeeDetailsModel.getEmpSalary());
			employeeDetails.setPassword(employeeDetailsModel.getPassword());
			
			EmployeeDetails save=this.employeeDetailRepository.save(employeeDetails);
			EmployeeDetailsModel employeeDetailsModel1=new 	EmployeeDetailsModel();
			employeeDetailsModel1.setEmpId(save.getEmpId());
			return employeeDetailsModel1;
			
		}

		@Override
		public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetail) {
			EmployeeDetails update=this.employeeDetailRepository.save(employeeDetail);
			return update;
		}

		@Override
		public List<EmployeeDetails> getEmployeeDetails() {
			List<EmployeeDetails> find=this.employeeDetailRepository.findAll();
			return find;
		}

		@Override
		public String deleteEmployee(Long id) {
			this.employeeDetailRepository.deleteById(id);
			return "deleted";
		}


		

	   
	}




