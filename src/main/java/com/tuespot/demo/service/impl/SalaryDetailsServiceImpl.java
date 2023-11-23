package com.tuespot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.HrDetails;
import com.tuespot.demo.Entity.SalaryDetails;
import com.tuespot.demo.Repo.HrDetailsRepository;
import com.tuespot.demo.Repo.SalaryDetailsRepository;
import com.tuespot.demo.service.SalaryDetailsService;
@Service
public class SalaryDetailsServiceImpl implements SalaryDetailsService {
	
	
	 @Autowired
	    private  SalaryDetailsRepository salaryDetailsRepository;


	@Override
	public SalaryDetails createSalaryDetails(SalaryDetails salaryDetails) {
		SalaryDetails create=this.salaryDetailsRepository.save(salaryDetails);
		
		return create;
	}

	@Override
	public SalaryDetails updateSalaryDetails(SalaryDetails salaryDetails) {
		SalaryDetails update=this.salaryDetailsRepository.save(salaryDetails);
		return update;
	}
	

	@Override
	public List<SalaryDetails> getSalaryDetails() {
		
		List<SalaryDetails> find=this.salaryDetailsRepository.findAll();
		return find;
	}

	@Override
	public String deleteSalaryDetails(Long id) {
		
		this.salaryDetailsRepository.deleteById(id);
		return "deleted";
	}

}
