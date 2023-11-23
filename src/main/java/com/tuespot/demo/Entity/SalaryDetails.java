package com.tuespot.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaryDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double amount;
	private String empName;
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "SalaryDetails [id=" + id + ", amount=" + amount + ", empName=" + empName + ", getId()=" + getId()
				+ ", getAmount()=" + getAmount() + ", getEmpName()=" + getEmpName() + "]";
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
	
	

}
