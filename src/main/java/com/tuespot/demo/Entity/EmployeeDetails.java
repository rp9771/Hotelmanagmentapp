package com.tuespot.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @javax.validation.constraints.NotEmpty(message="name cannoct be null")
    @Size(min = 3, max = 50,message="Name should be greater then 3 words and in under 50 words")
	private String empName;
	private String empEmail;
	private String empId;
	private String password;
	private int empSalary;
	
	
	
	@OneToOne
	  private EmployeeAssets employeeAssets;
	
	 
	@OneToOne
	private ExperinceDetails experinceDetails  ;
	
	
	@OneToOne
	private ProjectDetails projectDetails;
	
	
	@OneToOne
	private SalaryDetails salaryDetails;
	
	@OneToOne
	private HrDetails hrdetails;
	
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
		return "EmployeeDetails [id=" + id + ", empName=" + empName + ", empEmail=" + empEmail + ", empId=" + empId
				+ ", password=" + password + ", empSalary=" + empSalary + ", employeeAssets=" + employeeAssets + "]";
	}
	

}
