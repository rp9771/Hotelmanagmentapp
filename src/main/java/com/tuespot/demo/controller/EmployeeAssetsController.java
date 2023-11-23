package com.tuespot.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.demo.Entity.EmployeeAssets;
import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.service.EmployeeAssetsService;
import com.tuespot.demo.service.EmployeeDetailService;

@RestController
@RequestMapping("/assets")
public class EmployeeAssetsController {
	 
	  @Autowired
	   private EmployeeAssetsService employeeAssetsService;

	    @PostMapping("/")
	    public EmployeeAssets createEmployeeAssets(@Valid @RequestBody EmployeeAssets employeeAssets) {
	        return this.employeeAssetsService.createEmployeeAssets(employeeAssets);
	    }

	    @PutMapping("/")
	    public EmployeeAssets updateEmployeeAssets(EmployeeAssets employeeAssets) {
	        return this.employeeAssetsService.updateEmployeeAssets(employeeAssets);
	    }
	    @GetMapping("/")
	    public List<EmployeeAssets> getAll() {
	        return this.employeeAssetsService.getEmployeeAssets();
	    }
	    @DeleteMapping("/")
	    public String delete(@RequestParam("id")Long id) {
	        return this.employeeAssetsService.deleteEmployeeAssets(id);
	    }

		
}
