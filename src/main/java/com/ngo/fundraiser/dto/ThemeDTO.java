package com.ngo.fundraiser.dto;

public class ThemeDTO {
	private int themeID;
    private String campaignName;
    private String keywords;
	public int getThemeID() {
		return themeID;
	}
	public void setThemeID(int themeID) {
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
