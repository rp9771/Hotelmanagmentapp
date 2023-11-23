package com.tuespot.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeAssets {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String assestName;
	    private String issueDate;
	    private String empId;
	    private String createdDate;
	    private String modifiedDate;
	    @OneToOne
	    private EmployeeAssets employeeDetail;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAssestName() {
			return assestName;
		}
		public void setAssestName(String assestName) {
			this.assestName = assestName;
		}
		public String getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(String issueDate) {
			this.issueDate = issueDate;
		}
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public String getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}
		public String getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(String modifiedDate) {
			this.modifiedDate = modifiedDate;
		}
		public EmployeeAssets getEmployeeDetail() {
			return employeeDetail;
		}
		public void setEmployeeDetail(EmployeeAssets employeeDetail) {
			this.employeeDetail = employeeDetail;
		}
		public EmployeeAssets() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "EmployeeAssets [id=" + id + ", assestName=" + assestName + ", issueDate=" + issueDate + ", empId="
					+ empId + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", employeeDetail="
					+ employeeDetail + "]";
		}
	    
	    
	    
	    
}