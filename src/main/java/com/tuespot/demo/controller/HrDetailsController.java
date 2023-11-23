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

import com.tuespot.demo.Entity.HrDetails;
import com.tuespot.demo.model.HrDetailsModel;
import com.tuespot.demo.service.HrDetailsService;

@RestController
@RequestMapping("/Hr details")
public class HrDetailsController {

	 @Autowired
	    private HrDetailsService hrDetailsService;
	 
	 
	 @PostMapping("/")
	    public HrDetailsModel createHrDetails( @Valid @RequestBody HrDetailsModel hrDetailsModel) {
	        return hrDetailsService.createHrDetails(hrDetailsModel);
	    }
	 
	 
	 @PutMapping("/")
	    public HrDetails updateHrDetails(HrDetails hrDetails) {
	        return hrDetailsService.updateHrDetails(hrDetails);
	    }
	 
	 
	 @GetMapping("/")
	    public List<HrDetails> getAll() {
	        return this.hrDetailsService.getHrDetails();
	    }
	 
	 
	 @DeleteMapping("/")
	    public String delete(@RequestParam("id")Long id) {
	        return this.hrDetailsService.deleteHrDetails(id);
	    }

}
