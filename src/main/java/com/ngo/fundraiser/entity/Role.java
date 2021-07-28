package com.ngo.fundraiser.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int roleID;
    
    @Column
    private String name;
    @Column
    private String rights;

    public Role() {
    }

    public Role(int roleID, String name, String rights) {
        this.roleID = roleID;
        this.name = name;
        this.rights = rights;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", name='" + name + '\'' +
                ", rights='" + rights + '\'' +
                '}';
    }
}
