//package com.ngo.fundraiser.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class CampaignDonations {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int receiptID;
//
//    // From Campaign Donations to Campaigns
//    @ManyToOne
//    @JoinColumn(name = "campaignID")
//    private Campaigns campaignID;
//
//    // From Campaign Donations to Donor
//    @ManyToOne
//    @JoinColumn(name = "donorID")
//    private Donor donorID;
//
//    private String date;
//    private int donationValue;
//    private String paymentDetails;
//}
