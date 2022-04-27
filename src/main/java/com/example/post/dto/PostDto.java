package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostDto {

    private String account;
    private String email;
    private String passward;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", passward='" + passward + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
