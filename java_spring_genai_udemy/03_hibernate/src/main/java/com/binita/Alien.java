package com.binita;

import jakarta.persistence.*;

//@Entity(name = "alien_table")
@Entity
@Table(name = "alien_table")
public class Alien {
    @Id
    private int aid;

    @Column(name = "alien_name")
    private String aname;

    @Transient
    private String atech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", atech='" + atech + '\'' +
                '}';
    }
}
