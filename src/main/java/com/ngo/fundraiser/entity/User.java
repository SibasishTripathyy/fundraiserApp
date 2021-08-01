package com.ngo.fundraiser.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int userID;
    @Column
    private String name;
    @Column
    private String password;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy = "CreatedBy")
    private List<Campaigns> campaigns;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne
    @JoinColumn(name = "roleID", referencedColumnName = "roleID")
    private Role role;

    public User() {}

    public User(int userID, String name, String password) {
        this.userID = userID;
        this.name = name;
        this.password = password;
    }

    public List<Campaigns> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaigns> campaigns) {
        this.campaigns = campaigns;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
