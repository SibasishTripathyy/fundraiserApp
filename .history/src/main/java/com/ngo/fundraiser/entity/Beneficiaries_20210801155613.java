package com.ngo.fundraiser.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Beneficiaries")
public class Beneficiaries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long beneficiaryID;
	
	@Column(name = "Name")
	private String name;

	@Column(name = "Address")
	private String address;
	
	@OneToMany(mappedBy = "beneficiaryID")
	private List<CampaignBeneficiaries> campaignBeneficaries;
	public Beneficiaries() {}

	public long getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
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

	
}
