package com.tuespot.demo.service;

import java.util.List;

import javax.validation.Valid;

import com.tuespot.demo.Entity.EmployeeAssets;
import com.tuespot.demo.model.AssetsModel;

public interface EmployeeAssetsService {
	public EmployeeAssets createEmployeeAssets(@Valid EmployeeAssets assetsModel);
	public EmployeeAssets updateEmployeeAssets(EmployeeAssets employeeAssets);
	public List<EmployeeAssets> getEmployeeAssets();
	public String deleteEmployeeAssets(Long id) ;
}
