package com.ngo.fundraiser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
