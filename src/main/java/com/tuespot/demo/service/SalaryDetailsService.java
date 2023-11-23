package com.tuespot.demo.service;

import java.util.List;

import com.tuespot.demo.Entity.SalaryDetails;

public interface SalaryDetailsService {
	public SalaryDetails createSalaryDetails(SalaryDetails salaryDetails);
	public SalaryDetails updateSalaryDetails(SalaryDetails salaryDetails);
	public List<SalaryDetails>getSalaryDetails();
	public String deleteSalaryDetails(Long id) ;

}
