package com.tuespot.demo.service;

import java.util.List;

import com.tuespot.demo.Entity.ProjectDetails;


public interface ProjectDetailsService {
	public ProjectDetails createProjectDetails(ProjectDetails projectDetails);
	public ProjectDetails updateProjectDetails(ProjectDetails projectDetails);
	public List<ProjectDetails>getProjectDetails();
	public String deleteProjectDetails(Long id) ;
	public ProjectDetails save(ProjectDetails projectDetails);
	public List<ProjectDetails> findAll();
	public void deleteById(Long id);
}
