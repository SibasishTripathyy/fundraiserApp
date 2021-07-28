package com.ngo.fundraiser.dto;

public class CampaignThemesDTO {
	
	private Long cTID;
	private long campaignID;
	private Long themeID;
	public Long getcTID() {
		return cTID;
	}
	public void setcTID(Long cTID) {
		this.cTID = cTID;
	}
	public long getCampaignID() {
		return campaignID;
	}
	public void setCampaignID(long campaignID) {
		this.campaignID = campaignID;
	}
	public Long getThemeID() {
		return themeID;
	}
	public void setThemeID(Long themeID) {
		this.themeID = themeID;
	}
	
}
