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
@Table(name = "CampaignDonation")
public class CampaignDonation {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ReceiptID")
	private Long recieptID;

	@ManyToOne
	@JoinColumn(name="campaignID")
	private Campaigns campaignID;
	

	@ManyToOne
	@JoinColumn(name="DonorID")
	Donor donorID;

	@Column(name = "Date")
	private String date;

	@Column(name = "DonationValue")
	private Long donationValue;

	@Column(name = "PaymentDetails")
	private String paymentDetails;
	
	public CampaignDonation() {	}
	
	public Long getRecieptID() {
		return recieptID;
	}

	public void setRecieptID(Long recieptID) {
		this.recieptID = recieptID;
	}

	public Campaigns getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(Campaigns campaignID) {
		this.campaignID = campaignID;
	}

	public Donor getDonorID() {
		return donorID;
	}

	public void setDonorID(Donor donorID) {
		this.donorID = donorID;
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
