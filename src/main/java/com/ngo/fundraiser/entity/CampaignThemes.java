//package com.ngo.fundraiser.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import antlr.collections.List;
//
//@Entity
//@Table(name = "campaign_themes")
//public class CampaignThemes {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column
//	private Long cTID;
//
//    @Column(name = "CampaignID")
//	private long campaignID;
//
//    @ManyToOne
//	@JoinColumn(name="themeID")
//	private Theme themeID;
//
//
//    public CampaignThemes() {}
//
//	public long getCampaignID() {
//		return campaignID;
//	}
//
//	public void setCampaignID(long campaignID) {
//		this.campaignID = campaignID;
//	}
//
//
//	public Theme getThemeID() {
//		return themeID;
//	}
//
//	public void setThemeID(Theme themeID) {
//		this.themeID = themeID;
//	}
//
//	public Long getcTID() {
//		return cTID;
//	}
//
//	public void setcTID(Long cTID) {
//		this.cTID = cTID;
//	}
//
//
//    // create relation with campaign and get cid
//
//    // create relation with theme and get theme id
//
//
//}
