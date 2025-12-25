package com.binita;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int aid;
    private String aname;
    private String atech;
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptops;

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

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
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
                ", laptops=" + laptops +
                '}';
    }
}
