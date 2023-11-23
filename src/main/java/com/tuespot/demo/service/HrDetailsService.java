package com.tuespot.demo.service;

import java.util.List;

import com.tuespot.demo.Entity.HrDetails;
import com.tuespot.demo.model.HrDetailsModel;

public interface HrDetailsService {
	public HrDetailsModel createHrDetails(HrDetailsModel hrDetailsModel);
	public HrDetails updateHrDetails(HrDetails hrDetails);
	public List<HrDetails>getHrDetails();
	public String deleteHrDetails(Long id) ;

}
