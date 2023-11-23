package com.tuespot.demo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeDetailsModel {

	
	private Long id;
	
	
	
    @javax.validation.constraints.NotEmpty(message="name cannoct be null")
    @Size(min = 3, max = 50,message="Name should be greater then 3 words and in under 50 words")
	private String empName;
    
    
    
	@javax.validation.constraints.NotNull(message="Email cannoct be null")
	//@Email(message = "Invalid email address")
	private String empEmail;
	
	
	
	@javax.validation.constraints.NotNull()
	@Size(min = 6, max = 10, message = "Employee ID must be between 6 and 10 characters")
	@Pattern(regexp = "^[A-Za-z0-9]+$", message = "Employee ID must contain only letters and numbers")
	private String empId;
	
	
	
	@javax.validation.constraints.NotNull(message="Password cannot be empty")
	@NotBlank(message = "Password must not be blank")
	@Size(min = 8, max = 30, message = "Password length must be between 8 and 30 characters")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$", message = "Password must contain at least one digit, one lowercase letter, and one uppercase letter")
	private String password;
	
	
	
	@Min(value = 1000, message = "Salary must be at least 1000")
	@Max(value = 100000, message = "Salary cannot exceed 100000000")
	private int empSalary;
	
	
	public EmployeeDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeDetailsModel(Long id, String empName, String emapEmail, String empId, String password,
			int empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empEmail = emapEmail;
		this.empId = empId;
		this.password = password;
		this.empSalary = empSalary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmapEmail() {
		return empEmail;
	}


	public void setEmapEmail(String emapEmail) {
		this.empEmail = emapEmail;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "EmployeeDetailsModel [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + ", empId="
				+ empId + ", password=" + password + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
