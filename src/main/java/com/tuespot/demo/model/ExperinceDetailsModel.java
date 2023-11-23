package com.tuespot.demo.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ExperinceDetailsModel {
	
	private Long id;
	@NotBlank(message = "Job title must not be blank")
	@Size(min = 3, max = 50, message = "Job title must be between 3 and 50 characters")
	private String jobTitle;
	
	
	@Min(value = 0, message = "Experience year must not be negative")
	@Max(value = 50, message = "Experience year cannot exceed 50")
    private int expYear ;
	
	@javax.validation.constraints.NotNull(message= "start date must not be null")
	@Future(message = "Start date must be in the future")
	private LocalDate startDate;
	@javax.validation.constraints.NotNull(message = "End date must not be null")
	@Future(message = "End date must be in the future")
	private LocalDate endDate;

  @NotBlank(message = "Previous company name must not be blank")
  @Size(min = 3, max = 100, message = "Previous company name must be between 3 and 100 characters")
	private String previousCompanyName;
  
  
  @DecimalMin(value = "0.01", message = "CTC must be greater than or equal to 0.01")
  @DecimalMax(value = "1000000.00", message = "CTC must not exceed 1,000,000.00")
	private int CTC;
  
  
  @DecimalMin(value = "0.01", message = "ExpectedCTC must be greater than or equal to 0.01")
  @DecimalMax(value = "1000000.00", message = "ExpectedCTC must not exceed 1,000,000.00")
	private int ExpectedCTC;
	
	public ExperinceDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExperinceDetailsModel(Long id, String jobTitle, int expYear, LocalDate startDate, LocalDate endDate,
			String previousCompanyName, int cTC, int expectedCTC) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.expYear = expYear;
		this.startDate = startDate;
		this.endDate = endDate;
		this.previousCompanyName = previousCompanyName;
		CTC = cTC;
		ExpectedCTC = expectedCTC;
	}

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
		return "ExperinceDetailsModel [id=" + id + ", jobTitle=" + jobTitle + ", expYear=" + expYear + ", startDate="
				+ startDate + ", endDate=" + endDate + ", previousCompanyName=" + previousCompanyName + ", CTC=" + CTC
				+ ", ExpectedCTC=" + ExpectedCTC + "]";
	}
	
	

}
