package com.tuespot.demo.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ExperinceDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String jobTitle;
    private int expYear ;
	private LocalDate startDate;
	private LocalDate endDate;
	private String previousCompanyName;
	private int CTC;
	private int ExpectedCTC;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPreviousCompanyName() {
		return previousCompanyName;
	}
	public void setPreviousCompanyName(String previousCompanyName) {
		this.previousCompanyName = previousCompanyName;
	}
	public int getCTC() {
		return CTC;
	}
	public void setCTC(int cTC) {
		CTC = cTC;
	}
	public int getExpectedCTC() {
		return ExpectedCTC;
	}
	public void setExpectedCTC(int expectedCTC) {
		ExpectedCTC = expectedCTC;
	}
	@Override
	public String toString() {
		return "ExperinceDetails [id=" + id + ", jobTitle=" + jobTitle + ", expYear=" + expYear + ", startDate="
				+ startDate + ", endDate=" + endDate + ", previousCompanyName=" + previousCompanyName + ", CTC=" + CTC
				+ ", ExpectedCTC=" + ExpectedCTC + ", getId()=" + getId() + ", getJobTitle()=" + getJobTitle()
				+ ", getExpYear()=" + getExpYear() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getPreviousCompanyName()=" + getPreviousCompanyName() + ", getCTC()=" + getCTC()
				+ ", getExpectedCTC()=" + getExpectedCTC() + "]";
	}
	
	    

}
