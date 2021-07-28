package com.ngo.fundraiser.entity;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "DonorInterestID")
	private long donorInterestID;
	
	@ManyToOne
	@JoinColumn(name="themeId")
	private Theme themesID;

	@ManyToOne
	@JoinColumn(name="DonorID")
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

	public Theme getThemesID() {
		return themesID;
	}

	public void setThemesID(Theme themesID) {
		this.themesID = themesID;
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
	
