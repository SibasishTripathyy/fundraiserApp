package com.ngo.fundraiser.dto;

public class CampaignDonationDTO {

	private Long recieptID;
	private Long CampaignID;
	private Long donorId;
	private String date;
	private Long donationValue;
	private String paymentDetails;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getRecieptID() {
		return recieptID;
	}
	public void setRecieptID(Long recieptID) {
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
	public Long getDonationValue() {
		return donationValue;
	}
	public void setDonationValue(Long donationValue) {
		this.donationValue = donationValue;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
}
