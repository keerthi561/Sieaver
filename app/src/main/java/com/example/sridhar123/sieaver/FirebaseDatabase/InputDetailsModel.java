package com.example.sridhar123.sieaver.FirebaseDatabase;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class InputDetailsModel {

    private String name;
    private String email;
    private String referralCode;
    private String photo;

    public InputDetailsModel(String name, String email, String referralCode,String photo) {
        this.name = name;
        this.email = email;
        this.referralCode = referralCode;
        this.photo=photo;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
