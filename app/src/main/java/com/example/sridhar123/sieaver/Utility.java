package com.example.sridhar123.sieaver;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class Utility {

    public static boolean isEmailValid(String email) {
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }
    }

}
