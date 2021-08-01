package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int themeID;
    @Column
    private String campaignName;
    @Column
    private String keywords;

    /*
    	Both the mappedBy values are same for
    	CampaignThemes
    	&
    	DonorInterest
     */

	// From Themes to Campaign Themes
	@OneToMany(mappedBy = "themeID", cascade = CascadeType.ALL)
	private List<CampaignThemes> campaignThemes;

	// From Themes to Donor Interest
	@OneToMany(mappedBy = "themeID", cascade = CascadeType.ALL)
	private List<DonorInterest> donorInterests;

	public Theme() {}
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
