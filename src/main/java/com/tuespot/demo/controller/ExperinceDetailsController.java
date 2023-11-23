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

import com.tuespot.demo.Entity.ExperinceDetails;
import com.tuespot.demo.model.ExperinceDetailsModel;
import com.tuespot.demo.service.ExperinceDetailsService;

@RestController
@RequestMapping("/experince")
public class ExperinceDetailsController {
	
	 @Autowired
	    private ExperinceDetailsService experinceDetailsService;
	 
	 
	 @PostMapping("/")
	    public ExperinceDetailsModel createExperinceDetails(@Valid @RequestBody ExperinceDetailsModel experinceDetailsModel) {
	        return experinceDetailsService.createExperinceDetails(experinceDetailsModel);
	    }
	 
	 
	 @PutMapping("/")
	    public ExperinceDetails updateExperinceDetails(ExperinceDetails experinceDetails) {
	        return experinceDetailsService.updateExperinceDetails(experinceDetails);
	    }
	 
	 
	 @GetMapping("/")
	    public List<ExperinceDetails> getAll( ) {
	        return this.experinceDetailsService.getExperinceDetails();
	    }
	 
	 
	 @DeleteMapping("/")
	    public String delete(@RequestParam("id")Long id) {
	        return this.experinceDetailsService.deleteExperinceDetails(id);
	    }


}
