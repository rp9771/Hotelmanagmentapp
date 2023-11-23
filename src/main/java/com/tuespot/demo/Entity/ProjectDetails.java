package com.tuespot.demo.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String projectName;
private String projectDescription;
private LocalDate startDate;
private String role;
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
	return "ProjectDetails [id=" + id + ", projectName=" + projectName + ", projectDescription=" + projectDescription
			+ ", startDate=" + startDate + ", role=" + role + "]";
}






}




