package com.example.spacego.mongodb;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "personal_info")
public class UserDetails {

//    @Id
//    private String id;

//    @Field("space_id")
//    @Id
//    private String spaceId;

    @Field("firstName")
    private String firstName;

    @Field("lastName")
    private String lastName;

    @Field("dob")
    private String dob;

    @Field("email")
    private String email;

    @Field("phone")
    private String phone;

    @Field("address")
    private String address;



    @Field("nationality")
    private String nationality;

    @Field("experience")
    private String experience;

    @Field("emergencyContact")
    private String emergencyContact;

    @Field("suitSize")
    private String suitSize;

    @Field("insurance")
    private boolean insurance;

    @Field("mealType")
    private String mealType;

    @Field(name = "msnId")
    private String msnId;



    public UserDetails() {

    }

    public UserDetails(String firstName, String lastName, String dob, String email, String phone, String address, String nationality, String experience, String emergencyContact, String suitSize, boolean insurance, String mealType, String msnId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nationality = nationality;
        this.experience = experience;
        this.emergencyContact = emergencyContact;
        this.suitSize = suitSize;
        this.insurance = insurance;
        this.mealType = mealType;
        this.msnId = msnId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getSuitSize() {
        return suitSize;
    }

    public void setSuitSize(String suitSize) {
        this.suitSize = suitSize;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMsnId() {
        return msnId;
    }

    public void setMsnId(String msnId) {
        this.msnId = msnId;
    }
}

