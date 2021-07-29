package com.ngo.fundraiser.dto;

public class CampaignThemesDTO {
	
	private Long cTID;
	private Long campaignID;
	private Long themeID;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getcTID() {
		return cTID;
	}
	public void setcTID(Long cTID) {
		this.cTID = cTID;
	}
	public Long getCampaignID() {
		return campaignID;
	}
	public void setCampaignID(Long campaignID) {
		this.campaignID = campaignID;
	}
	public Long getThemeID() {
		return themeID;
	}
	public void setThemeID(Long themeID) {
		this.themeID = themeID;
	}
	
}
