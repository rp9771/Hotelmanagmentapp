package com.tuespot.demo.service;

import java.util.List;

import com.tuespot.demo.Entity.ExperinceDetails;
import com.tuespot.demo.model.ExperinceDetailsModel;

public interface ExperinceDetailsService {
	public ExperinceDetailsModel createExperinceDetails(ExperinceDetailsModel experinceDetailsModel);
	public ExperinceDetails updateExperinceDetails(ExperinceDetails experinceDetails);
	public List<ExperinceDetails>getExperinceDetails();
	public String deleteExperinceDetails(Long id) ;
	
}
