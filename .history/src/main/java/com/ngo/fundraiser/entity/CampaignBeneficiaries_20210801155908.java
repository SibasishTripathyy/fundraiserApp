package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "CampaignBeneficiaries")
public class CampaignBeneficiaries {

	@GeneratedValue
	@Id
	@Column(name = "CBeneID")
	private int cBeneID;

	@ManyToOne
	@JoinColumn(name="CampaignID")
	CampaignThemes campaignID;
	
	@ManyToOne
	@JoinColumn(name="beneficiaryID")
	private Beneficiaries beneficiaryID;

	@Column(name = "DonationValue")
	private int donationValue;

	public CampaignBeneficiaries() {}

	public int getcBeneID() {
		return cBeneID;
	}

	public void setcBeneID(int cBeneID) {
		this.cBeneID = cBeneID;
	}

	public CampaignThemes getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(CampaignThemes campaignID) {
		this.campaignID = campaignID;
	}

	public Beneficiaries getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(Beneficiaries beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}

	public int getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(int donationValue) {
		this.donationValue = donationValue;
	}

/*	@OneToMany
	List<CampaignsEntity> campaignsEntity;	

	@OneToMany
	List<CampaignBeneficiariesEntity> campaignBeneficiariesEntity;

	@OneToMany
	List<CampaignDonationsEntity> campaignDonationsEntity;	*/
}

