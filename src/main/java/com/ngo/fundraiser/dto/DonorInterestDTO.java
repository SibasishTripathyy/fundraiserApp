package com.ngo.fundraiser.dto;

public class DonorInterestDTO {
	private long donorInterestID;
	 private Long themeID;
	 private Long donorId;
	 private long budgetedValue;
	public long getDonorInterestID() {
		return donorInterestID;
	}
	public void setDonorInterestID(long donorInterestID) {
		this.donorInterestID = donorInterestID;
	}
	public Long getThemeID() {
		return themeID;
	}
	public void setThemeID(Long themeID) {
		this.themeID = themeID;
	}
	public Long getDonorId() {
		return donorId;
	}
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
	}
	public long getBudgetedValue() {
		return budgetedValue;
	}
	public void setBudgetedValue(long budgetedValue) {
		this.budgetedValue = budgetedValue;
	}
	 
	 
}
