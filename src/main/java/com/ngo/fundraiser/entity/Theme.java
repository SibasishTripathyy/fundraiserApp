package com.ngo.fundraiser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long themeID;
    @Column
    private String campaignName;
    @Column
    private String keywords;
    
	public Theme() {}
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
