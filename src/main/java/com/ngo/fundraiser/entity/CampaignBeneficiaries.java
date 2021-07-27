package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CampaignBeneficiaries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cBeneID;

    // added for bi directional to campaigns table
    @ManyToOne
    @JoinColumn(name = "campaignID")
    private Campaigns campaignId;

    // for beneficiaries table
    @OneToMany(mappedBy = "cBeneID", cascade = CascadeType.ALL)
    private List<Beneficiaries> beneficiaries;

    private int DonationValue;

    public int getCBeneID() {
        return cBeneID;
    }

    public void setCBeneID(int cBeneID) {
        this.cBeneID = cBeneID;
    }

    public Campaigns getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Campaigns campaignId) {
        this.campaignId = campaignId;
    }

    public List<Beneficiaries> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<Beneficiaries> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public int getDonationValue() {
        return DonationValue;
    }

    public void setDonationValue(int donationValue) {
        DonationValue = donationValue;
    }
}
