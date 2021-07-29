package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "CampaignBeneficiaries")
public class CampaignBeneficiaries {

	@GeneratedValue
	@Id
	@Column(name = "CBeneID")
	private Long cBeneID;

	@ManyToOne
	@JoinColumn(name="CampaignID")
	private Campaigns campaignID;
	
	@ManyToOne
	@JoinColumn(name="beneficiaryID")
	private Beneficiaries beneficiaryID;

	@Column(name = "DonationValue")
	private Long donationValue;

	public CampaignBeneficiaries() {}

	public Long getcBeneID() {
		return cBeneID;
	}

	public void setcBeneID(Long cBeneID) {
		this.cBeneID = cBeneID;
	}

	public Campaigns getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(Campaigns campaignID) {
		this.campaignID = campaignID;
	}

	public Beneficiaries getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(Beneficiaries beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}

	public Long getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(Long donationValue) {
		this.donationValue = donationValue;
	}

/*	@OneToMany
	List<CampaignsEntity> campaignsEntity;	

	@OneToMany
	List<CampaignBeneficiariesEntity> campaignBeneficiariesEntity;

	@OneToMany
	List<CampaignDonationsEntity> campaignDonationsEntity;	*/
}

