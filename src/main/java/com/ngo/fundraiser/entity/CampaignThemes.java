package com.ngo.fundraiser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CampaignThemes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cTID;

    // create relation with campaign and get cid

    // create relation with theme and get theme id
}
