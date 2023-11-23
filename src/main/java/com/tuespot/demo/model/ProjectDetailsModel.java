package com.tuespot.demo.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectDetailsModel {

	private Long id;
	
	@NotBlank(message = "Project name must not be blank")
	@Size(min = 3, max = 100, message = "Project name must be between 3 and 100 characters")
	private String projectName;
	
	
    @NotBlank(message = "Project description is required")
    @Size(min = 10, max = 200, message = "Project description must be between 10 and 200 characters")
	private String projectDescription;
	
	
    @NotNull(message = "Start date must not be null")
   
	private LocalDate startDate;
	
	
	
	@NotNull(message="Role cannot be null")
	private String role;
	
	public ProjectDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectDetailsModel(Long id, String projectName, String projectDescription, LocalDate startDate,
			String role) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.startDate = startDate;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ProjectDetailsModel [id=" + id + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", startDate=" + startDate + ", role=" + role + "]";
	}
	
	
}
