package com.example.sridhar123.syclo;

import android.content.Context;
import android.util.Log;

import com.example.sridhar123.syclo.Constants.SharedPrefConstants;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class PrefManager {

    Context context;
//    private EncryptedPreferences encryptedPreferences;

    public PrefManager(Context context) {
        this.context = context;
    }

    public boolean sharedPrefFileExists(String fileName) {
        if (context.getSharedPreferences(fileName, Context.MODE_PRIVATE) != null)
            return true;
        else
            return false;
    }

    //Save
    //implementation of function overloading
    public void savePref(String fileName, String prefKey, String prefValue) {
        context.getSharedPreferences(fileName, Context.MODE_PRIVATE).edit().putString(prefKey, prefValue).apply();
        // Toast.makeText(context, "updated", Toast.LENGTH_SHORT).show();
    }

    public void savePref(String fileName, String prefKey, boolean prefValue) {
        context.getSharedPreferences(fileName, Context.MODE_PRIVATE).edit().putBoolean(prefKey, prefValue).apply();
    }

    public void savePref(String fileName, String prefKey, int prefValue) {
        context.getSharedPreferences(fileName, Context.MODE_PRIVATE).edit().putInt(prefKey, prefValue).apply();
    }

    //Retrieve
    //implementation of function overloading
    public String getPref(String fileName, String prefKey, String defaultValue) {
        return context.getSharedPreferences(fileName, Context.MODE_PRIVATE).getString(prefKey, defaultValue);
    }

    public int getPref(String fileName, String prefKey, int defaultValue) {
        return context.getSharedPreferences(fileName, Context.MODE_PRIVATE).getInt(prefKey, defaultValue);
    }

    public boolean getPref(String fileName, String prefKey, boolean defaultValue) {
        return context.getSharedPreferences(fileName, Context.MODE_PRIVATE).getBoolean(prefKey, defaultValue);
    }

    public void clearToken() {
        context.getSharedPreferences(SharedPrefConstants.SHARED_PREFS, Context.MODE_PRIVATE).edit().remove(SharedPrefConstants.TOKEN).commit();
    }

    /**
     *  Method is used to clear the shared preference information
     */
    public void clearSharedPreference() {
        context.getSharedPreferences(SharedPrefConstants.SHARED_PREFS, Context.MODE_PRIVATE).edit().clear().apply();
    }

    public void createEncryptedSharedPref(Context context) {
//        encryptedPreferences = new EncryptedPreferences.Builder(context).withEncryptionPassword("example").build();
    }

//    public void saveMpin(String mPin) {
//        encryptedPreferences.edit()
//                .putString(SharedPrefConstants.MPIN_CONFIRMED_INPUT, mPin)
//                .apply();
//
//        Log.d("mpin", "M Pin saved");
//    }

//    public String getEncryptedMpin() {
//        // String encryptedMpin = encryptedPreferences.getUtils().encryptStringValue(SharedPrefConstants.MPIN_CONFIRMED_INPUT);
////        String encryptedMpin = encryptedPreferences.getString(SharedPrefConstants.MPIN_CONFIRMED_INPUT, "NA");
//        Log.d("mpin", encryptedMpin + "");
//        return encryptedMpin;
//    }

//    public void getDecryptedMpin(String encryptedMpin) {
//        String decryptedMpin = encryptedPreferences.getUtils().decryptStringValue(encryptedMpin);
//        Log.d("mpin", decryptedMpin + "");
//    }

}
