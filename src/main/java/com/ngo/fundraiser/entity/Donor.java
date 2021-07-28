package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int donorId;

    private String name;
    private String address;
    private String contactDetails;
    private boolean keepAnonymous;
    private String email;
    private String LoginPassword;

    // From Donor to Campaign Donations
    @OneToMany(mappedBy = "donorID", cascade = CascadeType.ALL)
    private List<CampaignDonations> campaignDonations;

    // From Donor to Donor Interest
    @OneToMany(mappedBy = "donorId", cascade = CascadeType.ALL)
    private List<DonorInterest> donorInterests;

    public Donor() {
    }

    public List<CampaignDonations> getCampaignDonations() {
        return campaignDonations;
    }

    public void setCampaignDonations(List<CampaignDonations> campaignDonations) {
        this.campaignDonations = campaignDonations;
    }

    public List<DonorInterest> getDonorInterests() {
        return donorInterests;
    }

    public void setDonorInterests(List<DonorInterest> donorInterests) {
        this.donorInterests = donorInterests;
    }

    public Donor(int donorId) {
        this.donorId = donorId;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
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

    public boolean isKeepAnonymous() {
        return keepAnonymous;
    }

    public void setKeepAnonymous(boolean keepAnonymous) {
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

    @Override
    public String toString() {
        return "Donor{" +
                "donorId=" + donorId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", keepAnonymous=" + keepAnonymous +
                ", email='" + email + '\'' +
                ", LoginPassword='" + LoginPassword + '\'' +
                '}';
    }
}
