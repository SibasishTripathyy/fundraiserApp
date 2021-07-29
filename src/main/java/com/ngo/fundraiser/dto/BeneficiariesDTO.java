package com.ngo.fundraiser.dto;

public class BeneficiariesDTO {

	private long beneficiaryID;
	private String name;
	private String address;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getBeneficiaryID() {
		return beneficiaryID;
	}
	public void setBeneficiaryID(long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
