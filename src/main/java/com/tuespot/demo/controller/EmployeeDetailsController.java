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

import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.model.EmployeeDetailsModel;
import com.tuespot.demo.service.EmployeeDetailService;

@RestController
@RequestMapping("/details")
public class EmployeeDetailsController {
	

    @Autowired
    private EmployeeDetailService employeeDetailService;
    
 

    @PostMapping("/")
    public EmployeeDetailsModel createEmployeeDetails( @Valid @RequestBody EmployeeDetailsModel employeeDetailsModel) {
        return  this.employeeDetailService.createEmployeeDetails(employeeDetailsModel);
    }

    @PutMapping("/")
    public EmployeeDetails updateEmployeeDetails(@Valid  @RequestBody  EmployeeDetails employeeDetails) {
        return employeeDetailService.updateEmployeeDetails(employeeDetails);
    }
    @GetMapping("/")
    public List<EmployeeDetails> getAll(  @Valid  @RequestBody EmployeeDetailsModel employeeDetails) {
        return this.employeeDetailService.getEmployeeDetails();
    }
    @DeleteMapping("/")
    public String delete(@RequestParam("id")Long id) {
        return this.employeeDetailService.deleteEmployee(id);
    }

}

