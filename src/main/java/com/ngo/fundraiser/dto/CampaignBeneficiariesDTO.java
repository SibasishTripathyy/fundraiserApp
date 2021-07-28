package com.ngo.fundraiser.dto;

public class CampaignBeneficiariesDTO {
	
	private long cBeneID;
	private Long CampaignID;
	private long beneficiaryID;
	private long donationValue;
	public long getcBeneID() {
		return cBeneID;
	}
	public void setcBeneID(long cBeneID) {
		this.cBeneID = cBeneID;
	}
	public Long getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(Long campaignID) {
		CampaignID = campaignID;
	}
	public long getBeneficiaryID() {
		return beneficiaryID;
	}
	public void setBeneficiaryID(long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}
	public long getDonationValue() {
		return donationValue;
	}
	public void setDonationValue(long donationValue) {
		this.donationValue = donationValue;
	}
	
}
