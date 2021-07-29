package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "donor")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int donorId;

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String contactDetails;
    @Column
    private boolean keepAnonymous;
    @Column
    private String email;
    @Column
    private String LoginPassword;

    // From Donor to Donor Interest
    @OneToMany(mappedBy = "donorID")
    private List<DonorInterest> donorInterests;

    public Donor() {
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

    public List<DonorInterest> getDonorInterests() {
        return donorInterests;
    }

    public void setDonorInterests(List<DonorInterest> donorInterests) {
        this.donorInterests = donorInterests;
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
