package com.ngo.fundraiser.dto;

public class CampaignDonationDTO {

	private long recieptID;
	private Long CampaignID;
	private Long donorId;
	private String date;
	private long donationValue;
	private String paymentDetails;
	public long getRecieptID() {
		return recieptID;
	}
	public void setRecieptID(long recieptID) {
		this.recieptID = recieptID;
	}
	public Long getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(Long campaignID) {
		CampaignID = campaignID;
	}
	public Long getDonorId() {
		return donorId;
	}
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getDonationValue() {
		return donationValue;
	}
	public void setDonationValue(long donationValue) {
		this.donationValue = donationValue;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
}
