package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "campaigns")
public class Campaigns {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int CampaignID;
    
    @Column(name = "name")
    private String Name;
    @Column(name = "imageurl")
    private String ImageURL;
    @Column(name = "message")
    private String Message;
    @Column(name = "target_donation")
    private String Target_Donation;
    @Column(name = "start_date")
    private String Start_Date;
    @Column(name = "end_date")
    private String End_Date;
    @Column(name = "status")
    private String Status;

    // userID FK
    @ManyToOne
    @JoinColumn(name = "userID")
    private User CreatedBy;

    // campaign beneficiaries relation
//    @OneToMany(mappedBy = "campaignId", cascade = CascadeType.ALL)
//    private List<CampaignBeneficiaries> campaignBeneficiaries;

    public Campaigns() {
    }

    public Campaigns(int campaignID, String name, String imageURL, String message, String target_Donation,
                     String start_Date, String end_Date, String status, User createdBy) {
        CampaignID = campaignID;
        Name = name;
        ImageURL = imageURL;
        Message = message;
        Target_Donation = target_Donation;
        Start_Date = start_Date;
        End_Date = end_Date;
        Status = status;
        CreatedBy = createdBy;
    }

    public int getCampaignID() {
        return CampaignID;
    }

    public void setCampaignID(int campaignID) {
        CampaignID = campaignID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getTarget_Donation() {
        return Target_Donation;
    }

    public void setTarget_Donation(String target_Donation) {
        Target_Donation = target_Donation;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String start_Date) {
        Start_Date = start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String end_Date) {
        End_Date = end_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public User getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(User createdBy) {
        CreatedBy = createdBy;
    }

    @Override
    public String toString() {
        return "Campaigns{" +
                "CampaignID=" + CampaignID +
                ", Name='" + Name + '\'' +
                ", ImageURL='" + ImageURL + '\'' +
                ", Message='" + Message + '\'' +
                ", Target_Donation='" + Target_Donation + '\'' +
                ", Start_Date='" + Start_Date + '\'' +
                ", End_Date='" + End_Date + '\'' +
                ", Status='" + Status + '\'' +
                ", CreatedBy='" + CreatedBy + '\'' +
                '}';
    }
}
