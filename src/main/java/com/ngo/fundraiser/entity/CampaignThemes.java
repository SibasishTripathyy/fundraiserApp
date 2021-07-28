package com.ngo.fundraiser.entity;

import javax.persistence.*;

@Entity
public class CampaignThemes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cTID;

    // From Campaign Themes to Campaigns
    // Non owning side doesn't have a fk


    // From Campaign Themes to Themes
    // Since FK name is same, adding "_fk"
    @ManyToOne
    @JoinColumn(name = "themeID_fk")
    private Theme themeID_fk;
}
