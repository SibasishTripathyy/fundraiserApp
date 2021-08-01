package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "CampaignBeneficiaries")
public class CampaignBeneficiaries {

	@GeneratedValue
	@Id
	@Column(name = "CBeneID")
	private long cBeneID;

	@ManyToOne
	@JoinColumn(name="CampaignID")
	CampaignThemes campaignID;
	
	@ManyToOne
	@JoinColumn(name="beneficiaryID")
	private Beneficiaries beneficiaryID;

	@Column(name = "DonationValue")
	private long donationValue;

	public CampaignBeneficiaries() {}

	public long getcBeneID() {
		return cBeneID;
	}

	public void setcBeneID(long cBeneID) {
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

	public long getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(long donationValue) {
		this.donationValue = donationValue;
	}

/*	@OneToMany
	List<CampaignsEntity> campaignsEntity;	

	@OneToMany
	List<CampaignBeneficiariesEntity> campaignBeneficiariesEntity;

	@OneToMany
	List<CampaignDonationsEntity> campaignDonationsEntity;	*/
}

