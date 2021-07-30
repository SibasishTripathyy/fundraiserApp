package com.ngo.fundraiser.dto;

public class CampaignBeneficiariesDTO {
	
	private Long cBeneID;
	private Long CampaignID;
	private Long beneficiaryID;
	private Long donationValue;
	private String message;
	private String createdBy;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getcBeneID() {
		return cBeneID;
	}
	public void setcBeneID(Long cBeneID) {
		this.cBeneID = cBeneID;
	}
	public Long getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(Long campaignID) {
		CampaignID = campaignID;
	}
	public Long getBeneficiaryID() {
		return beneficiaryID;
	}
	public void setBeneficiaryID(Long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}
	public Long getDonationValue() {
		return donationValue;
	}
	public void setDonationValue(Long donationValue) {
		this.donationValue = donationValue;
	}
	
}
