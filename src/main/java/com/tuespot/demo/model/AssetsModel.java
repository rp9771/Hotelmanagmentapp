package com.tuespot.demo.model;

import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

public class AssetsModel {

	
	    private Long id;
	    
	    
	    @javax.validation.constraints.NotNull(message="PAN Card cannot be empty")
	    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Invalid PAN card format")
	    private String panCard;
	    
	    
	    @javax.validation.constraints.NotNull(message="Voter card cannot be empty")
	    @Pattern(regexp = "[A-Z]{3}[0-9]{7}", message = "Invalid voter card format")
	    private String voteCard;
	    
	    
	    
	    @javax.validation.constraints.NotNull(message="Adharcard cannoct be empty")
	    @Pattern(regexp = "[A-Z]{3}[0-9]{7}", message = "Invalid Adhar card format")
	    private String adharCard;
	    
	    
	    
	    
	    @javax.validation.constraints.NotNull(message="Marksheet cannot be empty")
	    @Pattern(regexp = "[A-Z]{3}[0-9]{7}", message = "Invalid Marksheet card format")
	    private String markSheet;
	    
	    
	    @javax.validation.constraints.NotNull(message="CV cannoct be empty")
	    private String cv;
	    
	    
		public AssetsModel() {
			super();
			// TODO Auto-generated constructor stub
		}


		public AssetsModel(Long id, String panCard, String voteCard, String adharCard, String markSheet, String cv) {
			super();
			this.id = id;
			this.panCard = panCard;
			this.voteCard = voteCard;
			this.adharCard = adharCard;
			this.markSheet = markSheet;
			this.cv = cv;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getPanCard() {
			return panCard;
		}


		public void setPanCard(String panCard) {
			this.panCard = panCard;
		}


		public String getVoteCard() {
			return voteCard;
		}


		public void setVoteCard(String voteCard) {
			this.voteCard = voteCard;
		}


		public String getAdharCard() {
			return adharCard;
		}


		public void setAdharCard(String adharCard) {
			this.adharCard = adharCard;
		}


		public String getMarkSheet() {
			return markSheet;
		}


		public void setMarkSheet(String markSheet) {
			this.markSheet = markSheet;
		}


		public String getCv() {
			return cv;
		}


		public void setCv(String cv) {
			this.cv = cv;
		}


		@Override
		public String toString() {
			return "AssetsModel [id=" + id + ", panCard=" + panCard + ", voteCard=" + voteCard + ", adharCard="
					+ adharCard + ", markSheet=" + markSheet + ", cv=" + cv + "]";
		}
	    
	    
	    
}
