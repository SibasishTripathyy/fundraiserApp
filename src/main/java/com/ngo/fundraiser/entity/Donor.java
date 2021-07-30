package com.ngo.fundraiser.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long donorId;

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String contactDetails;
    @Column
    private Boolean keepAnonymous;
    @Column
    private String email;
    @Column
    private String LoginPassword;
    
    @OneToMany(mappedBy = "donorID")
    private List<CampaignDonation> campaignDonations;

    public List<CampaignDonation> getCampaignDonations() {
		return campaignDonations;
	}

	public void setCampaignDonations(List<CampaignDonation> campaignDonations) {
		this.campaignDonations = campaignDonations;
	}

	public Donor() {
    }

    public Donor(Long donorId) {
        this.donorId = donorId;
    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
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

    public Boolean isKeepAnonymous() {
        return keepAnonymous;
    }

    public void setKeepAnonymous(Boolean keepAnonymous) {
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
