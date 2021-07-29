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
    private Integer roleID;
    
    @Column
    private String name;
    @Column
    private String rights;

    public Role() {
    }

    public Role(Integer roleID, String name, String rights) {
        this.roleID = roleID;
        this.name = name;
        this.rights = rights;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
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
