package com.tuespot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.ExperinceDetails;
import com.tuespot.demo.Entity.HrDetails;
import com.tuespot.demo.Repo.HrDetailsRepository;
import com.tuespot.demo.model.ExperinceDetailsModel;
import com.tuespot.demo.model.HrDetailsModel;
import com.tuespot.demo.service.HrDetailsService;

@Service
public class HrDetailsServiceImpl implements HrDetailsService{
	

    @Autowired
    private  HrDetailsRepository hrDetailsRepository;

	
	
		

		
	

	@Override
	public HrDetails updateHrDetails(HrDetails hrDetails) {
		HrDetails update=this.hrDetailsRepository.save(hrDetails);
		return update;
	}

	@Override
	public List<HrDetails> getHrDetails() {
		List<HrDetails> find=this.hrDetailsRepository.findAll();
		return find;
		
	}

	@Override
	public String deleteHrDetails(Long id) {
		this.hrDetailsRepository.deleteById(id);
		return "deleted";
	}

	@Override
	public HrDetailsModel createHrDetails(HrDetailsModel hrDetailsModel) {
			HrDetails hrDetails=new HrDetails();
			hrDetails.setUsername(hrDetailsModel.getUsername());
			hrDetails.setPassword(hrDetailsModel.getPassword());
		
			HrDetails save=this.hrDetailsRepository.save(hrDetails);
			HrDetailsModel hrDetailsModel1=new HrDetailsModel();
			hrDetailsModel1.setId(save.getId());
			return hrDetailsModel1;
			
	}

	
}
