package com.SpringifyMongo.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class UserProfile {
    @Indexed(unique = true)
    private String email;
    private String mobile;

    public UserProfile() {}

    public String getEmail() { return email;}
    public void setEmail(String email) {this.email = email;}

    public String getMobile() { return mobile;}
    public void setMobile(String email) {this.mobile = mobile;}
}
