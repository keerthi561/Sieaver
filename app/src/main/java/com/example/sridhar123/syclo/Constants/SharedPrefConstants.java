package com.example.sridhar123.syclo.Constants;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class SharedPrefConstants {
    //shared prefs
    public static final String SHARED_PREFS = "shared_prefs_onboarding";
    public static final String TOKEN = "token";
    public static final String IS_KYC_VERIFIED = "is_kyc_verified";
    public static final String IS_PAN_UPDATED = "is_pan_updated";
    public static final String IS_BANK_UPDATED = "is_bank_updated";
    public static final String IS_FATCA_UPDATED = "is_fatca_updated";
    public static final String ON_BOARD_STATUS = "onboard_status";
    public static final String STATUS_MOBILE_VERIFIED = "mobile_verified";
    public static final String MOBILE_NUMBER = "mobile_number";
    public static final String EMAIL = "email_id";
    public static final String STATUS_ON_BOARDING_COMPLETE = "on_board_complete";
    public static final String STATUS_INTRO = "intro";
    public static final String STATUS_SIGNED_OUT_ATLEAST_ONCE = "signed_out_atleast_once";
    public static final String IS_INVESTMENT_CREATED = "is_investment_created";
    public static final String IS_MPIN_CREATED = "is_mpin_created";
    public static final String IS_APP_IN_BACKGROUND = "is_app_in_background";
    public static final String SETUP_LAUNCHED_FROM_DASHBOARD = "setup_launched_from_dashboard";
    public static final String TOUCHID="touchid";
    public static final String FROM_OTPVERIFICATION="from_otpverification";

    //invest withdraw
    public static final String INVEST_PRODUCT_SELECTED = "invest_product_selected";
    public static final String INVEST_AMOUNT = "invest_amount";
    public static final String WITHDRAW_PRODUCT_SELECTED = "withdraw_product_selected";
    public static final String WITHDRAW_AMOUNT = "withdraw_amount";
    public static final String GROUP_ID = "gid_";
    //-------- investment group id for all products
    public static final String SQRRL_AWAY_GROUP_ID = "sqrrl_away_gid_";
    public static final String BYOD_GROUP_ID = "byod_gid_";
    public static final String AXE_TAX_GROUP_ID = "axe_tax_gid_";

    //shared prefs for BYOD
    public static final String BYOD_SELECTED_CATEGORY = "byod_selected_category";
    public static final String BYOD_DESCRIPTION = "byod_description";

    //shared prefs for Axe Tax
    public static final String ALREADY_INVESTED_AMOUNT = "invested_amount";
    public static final String TAX_INVEST_COLLECTION = "collection";
    public static final String TAX_SAVINGS = "tax_savings";
    public static final String AMT_PPF = "amt_ppf";
    public static final String AMT_NSC = "amt_nsc";
    public static final String AMT_FD = "amt_fd";
    public static final String AMT_HOME_LOAN = "amt_home_loan";
    public static final String AMT_LIFE_INSURANCE = "amt_life_insurance";
    public static final String AMT_EPF = "amt_epf";

    //shared prefs for sqrrl away

    //shared prefs for Mpin
    public static final String MPIN_CONFIRMED_INPUT = "mpin_confirmed_input";

    //shared prefs for Permissions
    public static final String SHARED_PREFS_PERMS = "shared_prefs_perms";
    public static final String IS_SMS_PERMS_GRANTED = "is_sms_perms_granted";

    //shared prefs creds for Images
    public static final String SHARED_PREFS_SELFIE = "shared_prefs_selfie";
    public static final String SHARED_PREFS_PAN = "shared_prefs_pan";
    public static final String SHARED_PREFS_ADDRESS_FRONT = "shared_prefs_address_front";
    public static final String SHARED_PREFS_ADDRESS_BACK = "shared_prefs_address_back";
    public static final String SHARED_PREFS_SIGN = "shared_prefs_sign";
    public static final String FIELD_URL = "url";
    public static final String FIELD_AMZ_CREDENTIAL = "ceds";
    public static final String FIELD_AMZ_DATE = "date";
    public static final String FIELD_AMZ_SIGN = "sign";
    public static final String FIELD_AMZ_ALGO = "algo";
    public static final String FIELD_KEY = "key";
    public static final String FIELD_POLICY = "policy";

    // shared preference keys to store payment options
    public static final String PREF_PAYMENT_MODE = "payment_mode";

    //fingerprint applied or skipped
    public static final String FINGERPRINT_APPLIED ="fingerprint_applied";
    public static final String FINGERPRINT_SKIP="fingerprint_skip";
}
