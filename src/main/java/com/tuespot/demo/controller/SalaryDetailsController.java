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

import com.tuespot.demo.Entity.ProjectDetails;
import com.tuespot.demo.Entity.SalaryDetails;
import com.tuespot.demo.service.SalaryDetailsService;

@RestController
@RequestMapping("/Salary Detail")
public class SalaryDetailsController {
	
	 @Autowired
	    private SalaryDetailsService salaryDetailsService;
	 
	 
	 
	 @PostMapping("/")
	    public SalaryDetails create( @Valid @RequestBody SalaryDetails salaryDetails) {
	        return salaryDetailsService.createSalaryDetails(salaryDetails);
	    }
	 

	 @PutMapping("/")
	    public SalaryDetails updateSalaryDetails(SalaryDetails salaryDetails) {
	        return salaryDetailsService.updateSalaryDetails(salaryDetails);
	    }
	 
	 @GetMapping("/")
	    public List<SalaryDetails> getAll() {
	        return this.salaryDetailsService.getSalaryDetails();
	    }
	 
	 
	 @DeleteMapping("/")
	    public String delete(@RequestParam("id")Long id) {
	        return this.salaryDetailsService.deleteSalaryDetails(id);
	    }
	 

}
