package com.example.spacego.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "space_missions")
public class SpaceData {

    @Id
    private int id;
    private String missionName;
    private String organization;
    private String summary;
    private String description;
    private String launchDate;
    private String vehicle;
    private String launchSite;
    private Integer massKg;
    private String fundingAgency;
    private String time;
    private String publicAvailability;
    @Column(name = "amountrs")
    private Float amountRS;

    public SpaceData(String missionName, String organization, String summary, String description, String launchDate, String vehicle, String launchSite, Integer massKg, String fundingAgency, String time, String publicAvailability, Float amountRS) {
        this.missionName = missionName;
        this.organization = organization;
        this.summary = summary;
        this.description = description;
        this.launchDate = launchDate;
        this.vehicle = vehicle;
        this.launchSite = launchSite;
        this.massKg = massKg;
        this.fundingAgency = fundingAgency;
        this.time = time;
        this.publicAvailability = publicAvailability;
        this.amountRS = amountRS;
    }

    public SpaceData() {
    }

    public int getId() {
        return id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(String launchSite) {
        this.launchSite = launchSite;
    }

    public Integer getMassKg() {
        return massKg;
    }

    public void setMassKg(Integer massKg) {
        this.massKg = massKg;
    }

    public String getFundingAgency() {
        return fundingAgency;
    }

    public void setFundingAgency(String fundingAgency) {
        this.fundingAgency = fundingAgency;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPublicAvailability() {
        return publicAvailability;
    }

    public void setPublicAvailability(String publicAvailability) {
        this.publicAvailability = publicAvailability;
    }

    public Float getAmountRS() {
        return amountRS;
    }

    public void setAmountRS(Float amountRS) {
        this.amountRS = amountRS;
    }
}
