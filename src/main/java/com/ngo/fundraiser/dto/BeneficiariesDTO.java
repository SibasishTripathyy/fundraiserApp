package com.ngo.fundraiser.dto;

public class BeneficiariesDTO {

	private long beneficiaryID;
	private String name;
	private String address;
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
