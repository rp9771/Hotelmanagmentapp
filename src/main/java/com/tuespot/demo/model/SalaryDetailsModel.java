package com.tuespot.demo.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class SalaryDetailsModel {
	
	
	private Long id;
	
	@DecimalMin(value = "0.01", message = "Amount must be greater than or equal to 0.01")
	@DecimalMax(value = "1000000.00", message = "Amount must not exceed 1,000,000.00")
	private double amount;
	
	
	 @NotNull
	 @Size(min = 3, max = 50)
	private String empName;
	
	
	public SalaryDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SalaryDetailsModel(Long id, double amount, String empName) {
		super();
		this.id = id;
		this.amount = amount;
		this.empName = empName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "SalaryDetailsModel [id=" + id + ", amount=" + amount + ", empName=" + empName + "]";
	}
	
	
}
