package com.tuespot.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.tuespot.demo.Entity.HrDetails;
import com.tuespot.demo.Entity.ProjectDetails;
import com.tuespot.demo.Entity.SalaryDetails;
import com.tuespot.demo.Repo.HrDetailsRepository;
import com.tuespot.demo.Repo.ProjectDetailsRepository;
import com.tuespot.demo.service.ExperinceDetailsService;
import com.tuespot.demo.service.ProjectDetailsService;
@Service
public class ProjectDetailsServiceImpl  implements ProjectDetailsService{
	
	
	  @Autowired
	    private  ProjectDetailsRepository projectDetailsRepository;

	@Override
	public ProjectDetails createProjectDetails(ProjectDetails projectDetails) {
		ProjectDetails create=this.projectDetailsRepository.save(projectDetails);
		
		return create;
		
	}

	@Override
	public ProjectDetails updateProjectDetails(ProjectDetails projectDetails) {
		ProjectDetails update=this.projectDetailsRepository.save(projectDetails);
		return update;
	}

	@Override
	public List<ProjectDetails> getProjectDetails() {
		List<ProjectDetails> find=this.projectDetailsRepository.findAll();
		return find;
		
	}

	@Override
	public String deleteProjectDetails(Long id) {
		this.projectDetailsRepository.deleteById(id);
		return "deleted";
	
	}

	@Override
	public ProjectDetails save(ProjectDetails projectDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	 

}
