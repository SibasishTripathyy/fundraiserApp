package com.ngo.fundraiser.entity;

import javax.persistence.*;

@Entity
public class Beneficiaries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int beneficiaryId;

    private String Name;
    private String Address;

    // No field for fk mapping was given
    // created CBeneID as fk
    @ManyToOne
    @JoinColumn(name = "cBeneID")
    private CampaignBeneficiaries cBeneID;

    // getter and setter with getcBeanId vs getCBeanId issue

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public CampaignBeneficiaries getCBeneID() {
        return cBeneID;
    }

    public void setCBeneID(CampaignBeneficiaries cBeneID) {
        this.cBeneID = cBeneID;
    }
}
