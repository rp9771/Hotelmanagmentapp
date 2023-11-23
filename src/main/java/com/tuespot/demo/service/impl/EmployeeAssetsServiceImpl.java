package com.tuespot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.EmployeeAssets;
import com.tuespot.demo.Repo.EmployeeAssestsRepository;
import com.tuespot.demo.service.EmployeeAssetsService;

@Service
public class EmployeeAssetsServiceImpl implements EmployeeAssetsService{
	
	
	@Autowired
  private EmployeeAssestsRepository employeeAssestsRepository;
	
	@Override
	public EmployeeAssets createEmployeeAssets(EmployeeAssets employeeAssets) {
		 EmployeeAssets create=this.employeeAssestsRepository.save(employeeAssets);
		
		return create;
	}

	@Override
	public EmployeeAssets updateEmployeeAssets(EmployeeAssets employeeAssets) {
		EmployeeAssets update=this.employeeAssestsRepository.save(employeeAssets);
	
		return update;
	}

	@Override
	public List<EmployeeAssets> getEmployeeAssets() {
		List<EmployeeAssets> employeeAssest=this.employeeAssestsRepository.findAll();
		return employeeAssest;
	}


	@Override
	public String deleteEmployeeAssets(Long id) {
		this.employeeAssestsRepository.deleteById(id);
		return "deleted";
	}

	

}
