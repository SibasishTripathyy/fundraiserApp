package com.ngo.fundraiser.dto;

public class DonorDTO {
	private Long donorId;
    private String name;
    private String address; 
    private String contactDetails;
    private Boolean keepAnonymous;
    private String email;
    private String LoginPassword;
    private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getDonorId() {
		return donorId;
	}
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
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
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Boolean isKeepAnonymous() {
		return keepAnonymous;
	}
	public void setKeepAnonymous(Boolean keepAnonymous) {
		this.keepAnonymous = keepAnonymous;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginPassword() {
		return LoginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		LoginPassword = loginPassword;
	}
    
    
}
