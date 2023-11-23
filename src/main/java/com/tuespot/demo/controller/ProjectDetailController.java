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
import com.tuespot.demo.service.ProjectDetailsService;

@RestController
@RequestMapping("/Project controller")
public class ProjectDetailController {
	 @Autowired
	    private ProjectDetailsService projectDetailsService;
	    
	 
	 
	 @PostMapping("/")
	    public ProjectDetails createProjectDetails( @Valid @RequestBody ProjectDetails projectDetails) {
	        return projectDetailsService.createProjectDetails(projectDetails);
	    }
	 

	 @PutMapping("/")
	    public ProjectDetails updateProjectDetails(ProjectDetails projectDetails) {
	        return projectDetailsService.updateProjectDetails(projectDetails);
	    }
	 
	 @GetMapping("/")
	    public List<ProjectDetails> getAll( ) {
	        return this.projectDetailsService.getProjectDetails();
	    }
	 
	 
	 @DeleteMapping("/")
	    public String delete(@RequestParam("id")Long id) {
	        return this.projectDetailsService.deleteProjectDetails(id);
	    }
	 

}
