package com.ngo.fundraiser.dto;

public class ThemeDTO {
	private Long themeID;
    private String campaignName;
    private String keywords;
    private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getThemeID() {
		return themeID;
	}
	public void setThemeID(Long themeID) {
		this.themeID = themeID;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
    
}
