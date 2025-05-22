package com.example.spacego.entitycart;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_mission")
public class Cart {
    @Id
    @Column(name = "cartid")
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer cartId;
    @Column(name = "missionid")
   private Integer missionId;
    @Column(name = "missionname")
   private String missionName;
    @Column(name = "missionorg")
   private String missionOrg;
    @Column(name = "missionsummary")
   private String missionSummary;
    @Column(name = "amountrs")
   private Integer amountRS;

    public Cart(Integer missionId, String missionName, String missionOrg, String missionSummary, Integer amountRS) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionOrg = missionOrg;
        this.missionSummary = missionSummary;
        this.amountRS = amountRS;
    }

    public Cart() {
    }

    public Integer getCartId() {
        return cartId;
    }

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionOrg() {
        return missionOrg;
    }

    public void setMissionOrg(String missionOrg) {
        this.missionOrg = missionOrg;
    }

    public String getMissionSummary() {
        return missionSummary;
    }

    public void setMissionSummary(String missionSummary) {
        this.missionSummary = missionSummary;
    }

    public Integer getAmountRS() {
        return amountRS;
    }

    public void setAmountRS(Integer amountRS) {
        this.amountRS = amountRS;
    }
}
