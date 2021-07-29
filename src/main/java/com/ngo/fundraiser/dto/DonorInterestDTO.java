package com.ngo.fundraiser.dto;

public class DonorInterestDTO {
	private int donorInterestID;
	private int themeID;
	private int donorId;
	private int budgetedValue;

	public int getDonorInterestID() {
		return donorInterestID;
	}

	public void setDonorInterestID(int donorInterestID) {
		this.donorInterestID = donorInterestID;
	}

	public int getThemeID() {
		return themeID;
	}

	public void setThemeID(int themeID) {
		this.themeID = themeID;
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public int getBudgetedValue() {
		return budgetedValue;
	}

	public void setBudgetedValue(int budgetedValue) {
		this.budgetedValue = budgetedValue;
	}
}
