package com.binita;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Cacheable
public class Laptop {
    @Id
    private int lid;
    private String lbrand;
    private String lmodel;
    private int lram;


    public String getLbrand() {
        return lbrand;
    }

    public void setLbrand(String lbrand) {
        this.lbrand = lbrand;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLmodel() {
        return lmodel;
    }

    public void setLmodel(String lmodel) {
        this.lmodel = lmodel;
    }

    public int getLram() {
        return lram;
    }

    public void setLram(int lram) {
        this.lram = lram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                ", lid=" + lid +
                ", lbrand='" + lbrand + '\'' +
                ", lmodel='" + lmodel + '\'' +
                ", lram=" + lram +
                '}';
    }
}
