package com.ngo.fundraiser.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Donor_Interest")
public class DonorInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(name = "DonorInterestID")
	private long donorInterestID;

    // From DonorInterest to Theme
	@ManyToOne
	@JoinColumn(name="themeId")
	private Theme themeID;

	// From DonorInterest to Donor
	@ManyToOne
	@JoinColumn(name="donorID")
	private Donor donorID;

	@Column(name = "BudgetedValue")
	private long budgetedValue;

	public DonorInterest() {}

	public long getDonorInterestID() {
		return donorInterestID;
	}

	public void setDonorInterestID(long donorInterestID) {
		this.donorInterestID = donorInterestID;
	}

	public Theme getThemeID() {
		return themeID;
	}

	public void setThemeID(Theme themeID) {
		this.themeID = themeID;
	}

	public Donor getDonorID() {
		return donorID;
	}

	public void setDonorID(Donor donorID) {
		this.donorID = donorID;
	}

	public long getBudgetedValue() {
		return budgetedValue;
	}

	public void setBudgetedValue(long budgetedValue) {
		this.budgetedValue = budgetedValue;
	}
	
	
	}
	
