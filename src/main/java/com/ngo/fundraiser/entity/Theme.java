package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int themeID;
    private String campaignName;
    private String keywords;

    // From Theme to Donor Interest
    @OneToMany(mappedBy = "themeId", cascade = CascadeType.ALL)
    private List<DonorInterest> donorInterests;

    // From Theme to Campaign Themes
    @OneToMany(mappedBy = "themeID_fk", cascade = CascadeType.ALL)
    private List<CampaignThemes> campaignThemes;


    public List<CampaignThemes> getCampaignThemes() {
        return campaignThemes;
    }

    public void setCampaignThemes(List<CampaignThemes> campaignThemes) {
        this.campaignThemes = campaignThemes;
    }

    public List<DonorInterest> getDonorInterests() {
        return donorInterests;
    }

    public void setDonorInterests(List<DonorInterest> donorInterests) {
        this.donorInterests = donorInterests;
    }

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
