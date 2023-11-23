package com.tuespot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.EmployeeDetails;
import com.tuespot.demo.Entity.ExperinceDetails;
import com.tuespot.demo.Repo.ExperinceDetailsRepository;
import com.tuespot.demo.model.EmployeeDetailsModel;
import com.tuespot.demo.model.ExperinceDetailsModel;
import com.tuespot.demo.service.ExperinceDetailsService;

@Service
public class ExperinceDetailsServiceImpl  implements ExperinceDetailsService{

    @Autowired
    private  ExperinceDetailsRepository experinceDetailsRepository;

	@Override
	public ExperinceDetailsModel createExperinceDetails(ExperinceDetailsModel experinceDetailsModel) {
	ExperinceDetails experinceDetails=new ExperinceDetails();
	experinceDetails.setCTC(experinceDetailsModel.getCTC());
	experinceDetails.setEndDate(experinceDetailsModel.getEndDate());
	experinceDetails.setExpectedCTC(experinceDetailsModel.getExpectedCTC());
	//experinceDetails.setId(experinceDetailsModel.getId());
	experinceDetails.setJobTitle(experinceDetailsModel.getJobTitle());
	experinceDetails.setExpYear(experinceDetailsModel.getExpYear());
	experinceDetails.setPreviousCompanyName(experinceDetailsModel.getPreviousCompanyName());
	experinceDetails.setStartDate(experinceDetailsModel.getStartDate());
	

	ExperinceDetails save=this.experinceDetailsRepository.save(experinceDetails);
	ExperinceDetailsModel experinceDetailsModel1=new ExperinceDetailsModel();
	experinceDetailsModel1.setId(save.getId());
	return experinceDetailsModel1;
	
	
	}

	@Override
	public ExperinceDetails updateExperinceDetails(ExperinceDetails experinceDetails) {
		ExperinceDetails update=this.experinceDetailsRepository.save(experinceDetails);
		return update;
	}

	@Override
	public List<ExperinceDetails> getExperinceDetails() {
		List<ExperinceDetails> find=this.experinceDetailsRepository.findAll();
		return find;
		
	}

	@Override
	public String deleteExperinceDetails(Long id) {
		this.experinceDetailsRepository.deleteById(id);
		return "deleted";
	}

	
}

	
		
		

	

