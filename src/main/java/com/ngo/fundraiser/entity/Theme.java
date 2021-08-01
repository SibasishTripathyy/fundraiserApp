package com.ngo.fundraiser.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int themeID;
    private String campaignName;
    private String keywords;
}
