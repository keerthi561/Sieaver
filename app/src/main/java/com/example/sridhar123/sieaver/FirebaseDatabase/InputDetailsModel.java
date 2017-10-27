package com.example.sridhar123.sieaver.FirebaseDatabase;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class InputDetailsModel {

    private String name;
    private String email;
    private String referralCode;

    public InputDetailsModel(String name, String email, String referralCode) {
        this.name = name;
        this.email = email;
        this.referralCode = referralCode;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
