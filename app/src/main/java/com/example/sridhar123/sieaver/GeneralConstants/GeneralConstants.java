package com.example.sridhar123.sieaver.GeneralConstants;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class GeneralConstants {

    public static final String APP_PLAY_STORE_URL = "https://play.google.com/store/apps/details?id=in.sqrrl.app.sqrrlapi";

    public static final String mobileNumber = "mobile_number";
    public static final String pickerSelectedIndex = "picker_selected_index";
    public static final String selectedAmount = "selected_amount";
    public static final String selectedInstalmentAmount = "selected_instalment_amount";
    public static final String selectedDuration = "selected_duration";
    public static final String isDurationCapAdded = "isDurationCapAdded";
    public static final String selectedDurationIndex = "selected_duration_index";
    public static final String intent_parameter_mpin = "intent_mpin";
    public static final String tab_position = "tab_position";
    public static final String isAmountCustom = "is_amt_custom";
    public static final String pickerTypeAmount = "picker_type_amount";
    public static final String pickerTypeMonths = "picker_type_months";
    public static final String pickerTypeInstallments = "picker_type_installments";
    public static final int reqCode = 101;
    public static final String actionAfterApiFail = "action_api_fail";
    public static final int cancelClicked = 0;
    public static final int refreshClicked = 1;
    public static final String ERROR_MSG_CODE = "error_status";
    public static final String REQ_CODE = "req_code";
    public static final int NO_INTERNET_CONNECTION = 0;
    public static final int SOMETHING_WENT_WRONG = 1;
    public static final int FETCH_FRESH_JOB_ID = 2;
    public static boolean IS_API_CALL_ACTIVE = false;
    public static final int GRAPH_SCHEMES = 0;
    public static final int GRAPH_COMPARISON = 1;
    public static final int FONT_TYPE_MED = 0;
    public static final int FONT_TYPE_BOLD = 1;
    public static final int FONT_TYPE_SEMI_BOLD = 2;
    public static final String SCHEME_NAMES = "scheme_names";
    public static final String EXIT_DAYS = "exit_days";
    public static final String SCHEME_ALLOCATIONS = "scheme_allocations";
    public static final String SCHEME_IDS = "scheme_ids";
    public static final String BTW_SELECTED_CARDS = "btw_selected_cards";
    public static final String PREF_KEY = "pref_key";
    public static final String PROCEED_OFFLINE_MESSAGE = "proceed_offline_message";
    public static final String IS_AMOUNT_EDITABLE = "is_amt_editable";
    public static final String P_ID = "p_id";
    public static final String WAS_USER_LOGGED_OUT = "was_user_logged_out";

    //Product constants
    public static final int PID_SA = 1;
    public static final int PID_BYOD = 2;
    public static final int PID_AXE_TAX = 3;
    public static final String INVESTMENT_MONTHLY = "monthly";
    public static final String INVESTMENT_WEEKLY = "weekly";
    public static final String INVESTMENT_ONE_TIME = "one-time";
    public static final String GROUP_ID = "group_id";
    public static final String SCHEME_DETAILS = "scheme_details";
    public static final String TOTAL_SCHEMES = "total_schemes";
    public static final String LIST_SCHEME_IDS = "scheme_id_list";
    public static final String TRANSACTION_INFO_INVEST = "Credit will be reflected in your account in 1 business day.";
    public static final String TRANSACTION_INFO_WITHDRAW = "Money will be reflected in your bank account in 1 business day";
    public static final String TRANSACTION_TYPE = "t_type";
    public static final String TRANSACTION_TYPE_INVEST = "INVEST";
    public static final String TRANSACTION_TYPE_REDEEM = "REDEEM";
    public static final String ALREADY_INVESTED_AMOUNT = "already_invested";
    public static final String DEF_INSTALMENT = "def_instalment";
    public static final String AXE_TAX_MONTHLY_AMOUNT = "axe_tax_monthly";
    public static final String LIQUID = "liquid";
    public static final String GOAL_BASED = "goal_based";
    public static final String TAX_SAVING = "tax_saving";
    public static final String BYOD_CATEGORY_PURCHASE = "purchase";
    public static final String BYOD_CATEGORY_EXPERIENCE = "experience";
    public static final String BYOD_CATEGORY_TRIP = "trip";
    public static final String BYOD_CATEGORY_OCCASION = "occasion";
    public static final String BYOD_CATEGORY_CUSTOM = "custom";
    public static final String BYOD_SUBTEXT = "byod_subtext";
    public static final String BANK_TO_DASHBOARD = "bank_toDashboard";
    public static final String MONTH_YEAR = "month_year";
    public static final String MONTH_DAY_YEAR = "month_day_year";
    public static final String SUBTEXT_PURCHASE = "Harley Davidson, A Bose System, Pixel or iPhone8";
    public static final String SUBTEXT_EXPERIENCE = "Scuba Diving, Sky Diving, Music Festival";
    public static final String SUBTEXT_OCCASION = "Wedding, Anniversary, Birthday";
    public static final String SUBTEXT_TRIP = "Leh-Ladakh, Europe, South Asia";
    public static final String SUBTEXT_CUSTOM_GOAL = "Startup Fund, Mountaineering course";
    public static final String AVAILABLE_WITHDRAWAL_AMOUNT = "available_withdrawal_amount";
    public static final String WAS_ADHAAR_SKIPPED = "was_adhaar_skipped";
    public static final String requiredUrl = "requiredUrl";
    public static final String urlType = "urlType";
    //public static final String MPIN_CREA = "Startup Fund, Mountaineering course";

    //    public static final String GROUP_ID_SA = "IGZ0L8N271";
//    public static final String GROUP_ID_BYOD = "IGZ0L8N272";
//    public static final String GROUP_ID_AXE_TAX = "IGZ0L8N272";
    public static final String T_ID = "t_id";
    public static final String T_AMT = "t_amt";
    public static final String T_RETRY = "t_retry";
    public static final String T_PRODUCT = "t_pid";

    public static final float ROI_6 = 7f / 100;
    public static final float ROI_7_12 = 7.5f / 100;
    public static final float ROI_13_24 = 8.31f / 100;
    public static final float ROI_25_36 = 9.2f / 100;
    public static final float ROI_37_60 = 10.83f / 100;
    public static final float ROI_60_ABOVE = 14.3f / 100;
    public static final String ROI_6_LABEL = "7-8%";
    public static final String ROI_7_12_LABEL = "8-9%";
    public static final String ROI_13_24_LABEL = "8.5-9%";
    public static final String ROI_25_36_LABEL = "9.5-10%";
    public static final String ROI_37_60_LABEL = "11-12%";
    public static final String ROI_60_ABOVE_LABEL = "15-16%";

    public static final int MIN_AMT_TO_CHK_BYOD_INSTALMENT = 901;  // it will automatically be multiple of 100 so it would become 1000 if greater than 900

    public static final int MIN_INSTANT_CREDITED_AMT = 500;

//    public static final float ROI_6 = 7.75f / 100;
//    public static final float ROI_7_12 = 9f / 100;
//    public static final float ROI_13_24 = 10.5f / 100;
//    public static final float ROI_25_36 = 12f / 100;
//    public static final float ROI_37_60 = 13.5f / 100;
//    public static final String ROI_6_LABEL = "8-9%";
//    public static final String ROI_7_12_LABEL = "9-10%";
//    public static final String ROI_13_24_LABEL = "10-11%";
//    public static final String ROI_25_36_LABEL = "12-13%";
//    public static final String ROI_37_60_LABEL = "13-14%";

    public static final String statusSubtextKycCertified = "Congratulations! You are already KYC-Verified. Next step, we just need to connect your bank account to enable transactions.";
    public static final String statusSubtextAdharBased = "Looks like you are not KYC-Verified. Don’t worry, we will get you KYC-Verified right away. Please keep your Aadhaar Number handy.";
    public static final String statusSubtextPanBased = "Looks like you are not KYC-Verified. Don’t worry, we will get you KYC-Verified right away.";
    public static final String statusPanUpdated="Your PAN Details have been updated";
    public static final int launchBank = 0;
    public static final int launchAdhar = 1;
    public static final int launchPanBased = 2;
    public static final String launchCode = "launch_code";

    //Job status
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_SUCCESS = "SUCCESS";
    public static final String STATUS_FAILURE = "FAILURE";
    public static final String STATUS_RETRY = "RETRY";

    // Transaction status
    public static final String STATUS_PROCESSING = "PROCESSING";
    public static final String STATUS_INITIATED = "INITIATED";

    // Transaction type variable
    public static final String TRAN_TYPE_INVEST = "INVEST";
    public static final String TRAN_TYPE_REDEEM = "REDEEM";

    // Payment mode codes
    public static final String PAY_MODE_DEBIT_CARD = "D";
    public static final String PAY_MODE_RUPAY_CARD = "R";
    public static final String PAY_MODE_NET_BANKING = "N";
    public static final String PAY_MODE_NACH = "NACH";

    //sqrrl away
    public static final String sqrrlAwayAmountType = "amt_type";
    public static final String typeCustom = "custom";
    public static final String typeOneTime = "one_time";
    public static final String isWeekly = "isWeekly";
    public static final String schemeName = "scheme_name";
    public static final String schemeId = "scheme_id";


    //Pan Details
    public static final String panNumber = "pan_number";
    public static final String dob = "dob";
    public static final String failureStatus = "fail_status";

    //Aadhar Details
    public static final String aadhar = "aadhar_number";
    public static final String aadharMobile = "aadharMobile";
    public static final String aadharEmail = "aadharEmail";


    //Bank Details
    public static final String accountHolderName = "acc_holder_name";
    public static final String accNumber = "acc_number";
    public static final String ifscCode = "ifsc_code";
    public static final String bankInfo = "bankInfo";

    //status bar color flags
    public static final int status_bar_invest = 0;
    public static final int status_bar_withdraw = 1;
    public static final int status_bar_sqrrl_away = 2;
    public static final int status_bar_btw = 3;
    public static final int status_bar_byod = 4;

    //camera flags
    public static final String camera_flag = "camera_flag";
    public static final int camera_user_flag = 0;
    public static final int camera_pan_flag = 1;
    public static final int camera_address_front_flag = 2;
    public static final int camera_address_back_flag = 3;
    public static final int camera_sign_flag = 4;

    //UserSettings
    public static final int ONE_DAY_BEFORE = 1;
    public static final int TWO_DAYS_BEFORE = 2;
    public static final int THREE_DAYS_BEFORE = 3;
    public static final String SUMMARY_FRI = "friday";
    public static final String SUMMARY_SAT = "saturday";
    public static final String SUMMARY_SUN = "sunday";
    public static final int ACTION_CAMERA = 0;
    public static final int ACTION_GALLERY = 1;
    public static final String PIC_ACTION = "ACTION";
    public static final String IMAGE_PATH = "image-path";

    //Retrofit Failed Constant
    public static final int retrofit_onFailed_code = 10001;

    // constant to delay the cursor in edittext
    public static final int DELAY_MPIN_TEXT_FIELD = 20;

    /*Time duration after which the InvestProductSelectionActivity is finished*/
    public static final int TIME_TO_FINISH_ACTIVITY=200;

    // NACH statuses
    public static final String NACH_REGISTRATION_INITIATED = "INITIATED";
    public static final String NACH_REGISTRATION_SIGNED = "SIGNED";
    public static final String NACH_REGISTRATION_PROCESSING = "PROCESSING";
    public static final String NACH_REGISTRATION_SUCCESS = "SUCCESS";
    public static final String NACH_REGISTRATION_FAILURE = "FAILURE";

    // INTENT PATAMS
    public static final String IS_COMING_FROM_DEEP_LING = "IS_COMING_FROM_DEEP_LING";
    public static final String IS_COMING_AFTER_FIRST_SUCCESSFULL_TRANSACTION = "IS_COMING_AFTER_FIRST_SUCCESSFULL_TRANSACTION";
    public static final String IS_COMING_AFTER_SECURING_MPIN="IS_COMING_AFTER_SECURING_MPIN";
    public static final String IS_COMING_FROM_PROFILE_SETTINGS="IS_COMING_FROM_PROFILE_SETTINGS";
    public static final String IS_COMING_FROM_BANK_DETAILS_ACTIVITY="IS_COMING_FROM_BANK_DETAILS_ACTIVITY";
    public static final String IS_COMING_FROM_CONFIRM_BANK_DETAILS_ACTIVITY="IS_COMING_FROM_CONFIRM_BANK_DETAILS_ACTIVITY";
    public static final String IS_COMING_FROM_PAN_DETAILS_ACTIVITY="IS_COMING_FROM_PAN_DETAILS_ACTIVITY";
    public static final String IS_COMING_FROM_CONFIRM_PAN_DETAILS="IS_COMING_FROM_CONFIRM_PAN_DETAILS";
    public static final String KYC_STATUS_ACTIVITY="KYC_STATUS_ACTIVITY";
    public static final String sqrrlaway_byod_axetax = "{\n" +
            "   \"pan_updated\":true,\n" +
            "   \"level_display\":\"FATCA_UPDATED\",\n" +
            "   \"is_kyc_verified\":true,\n" +
            "   \"mobile_verified\":true,\n" +
            "   \"tips\":[  \n" +
            "      \"General tip text 1\",\n" +
            "      \"General tip text 2\",\n" +
            "      \"General tip text 3\",\n" +
            "      \"General tip text 4\"\n" +
            "   ],\n" +
            "   \"email\":\"m@gmail.c\",\n" +
            "   \"bank_updated\":true,\n" +
            "   \"name\":\"Paan Singh\",\n" +
            "   \"investments\":[  \n" +
            "      {  \n" +
            "         \"target_completion_on\":null,\n" +
            "         \"product_id\":1,\n" +
            "         \"display_name\":\"Sqrrl Away\",\n" +
            "         \"p_current_value\":510,\n" +
            "         \"tips\":[  \n" +
            "            \"Sqrrl Away tip 1\",\n" +
            "            \"Sqrrl Away tip 2\",\n" +
            "            \"Sqrrl Away tip 3\",\n" +
            "            \"Sqrrl Away tip 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"weekly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":500,\n" +
            "         \"group_id\":\"IGGX02SQRR\",\n" +
            "         \"internal_name\":\"liquid\",\n" +
            "         \"target_instalment_amount\":500,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":null,\n" +
            "         \"description\":null,\n" +
            "         \"p_net_investment\":500,\n" +
            "         \"p_net_gain_percentage\":2,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TG1DZX1G3Q\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGGX02Q1KL\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"retry_transaction\":{\n" +
            "         \t\"status\": \"PENDING\",\n" +
            "         \t\"amount\": 2000\n" +
            "         },\n" +
            "         \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8SSS\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":10,\n" +
            "         \"total_target_amount\":null\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_completion_on\":\"2020-05-16\",\n" +
            "         \"product_id\":2,\n" +
            "         \"display_name\":\"BYOD\",\n" +
            "         \"p_current_value\":2750,\n" +
            "         \"tips\":[  \n" +
            "            \"BYOD tip text 1\",\n" +
            "            \"BYOD tip text 2\",\n" +
            "            \"BYOD tip text 3\",\n" +
            "            \"BYOD tip text 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":3000,\n" +
            "         \"group_id\":\"IG3DPYBYOD\",\n" +
            "         \"internal_name\":\"goal_based\",\n" +
            "         \"target_instalment_amount\":1000,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":42,\n" +
            "         \"description\":\"Harley\",\n" +
            "         \"p_net_investment\":3000,\n" +
            "         \"p_net_gain_percentage\":10,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":1000,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":1500,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"retry_transaction\":{\n" +
            "         \t\"status\": \"PENDING\",\n" +
            "         \t\"amount\": 2000\n" +
            "         },\n" +
            "      \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8BBB\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":300,\n" +
            "         \"total_target_amount\":30000\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_completion_on\":\"2017-03-03\",\n" +
            "         \"product_id\":3,\n" +
            "         \"display_name\":\"Axe Tax\",\n" +
            "         \"p_current_value\":721,\n" +
            "         \"tips\":[  \n" +
            "            \"Axe Tax tip text 1\",\n" +
            "            \"Axe Tax tip text 2\",\n" +
            "            \"Axe Tax tip text 3\",\n" +
            "            \"Axe Tax tip text 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":700,\n" +
            "         \"group_id\":\"IG1DZXAXEE\",\n" +
            "         \"internal_name\":\"tax_saving\",\n" +
            "         \"target_instalment_amount\":null,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":3,\n" +
            "         \"description\":null,\n" +
            "         \"p_net_investment\":700,\n" +
            "         \"p_net_gain_percentage\":3,\n" +
            "         \"retry_transaction\":{\n" +
            "         \t\"status\": \"PENDING\",\n" +
            "         \t\"amount\": 2000\n" +
            "         },\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGDYRX50OY\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGDYRX50OY\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":700,\n" +
            "               \"group_id\":\"TG1DZX108G\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8AAA\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":14,\n" +
            "         \"total_target_amount\":2000\n" +
            "      }\n" +
            "   ],\n" +
            "   \"id\":\"CJJGE28ZY\",\n" +
            "   \"processing_transactions\":[  \n" +
            "      {  \n" +
            "         \"product_display_name\":\"Axe Tax\",\n" +
            "         \"product_id\":3,\n" +
            "         \"group_amount\":700,\n" +
            "         \"group_id\":\"TG1DZX108G\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":580\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Sqrrl Away\",\n" +
            "         \"product_id\":1,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TG1DZX1G3Q\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":579\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Axe Tax\",\n" +
            "         \"product_id\":3,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TGDYRX50OY\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":580\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Sqrrl Away\",\n" +
            "         \"product_id\":1,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TGGX02Q1KL\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":579\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"BYOD\",\n" +
            "         \"product_id\":2,\n" +
            "         \"group_amount\":554,\n" +
            "         \"group_id\":\"TGXEQ9DRQ2\",\n" +
            "         \"investment_description\":\"Harley\",\n" +
            "         \"investment\":582\n" +
            "      }\n" +
            "   ],\n" +
            "   \"upcoming_transactions\":[  \n" +
            "      {  \n" +
            "         \"target_instalment_amount\":null,\n" +
            "         \"group_id\":\"IG1DZX108G\",\n" +
            "         \"next_investment_on\":\"2017-01-02\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_instalment_amount\":1000,\n" +
            "         \"group_id\":\"IG3DPY2LP8\",\n" +
            "         \"next_investment_on\":\"2017-01-02\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_instalment_amount\":500,\n" +
            "         \"group_id\":\"IGGX02Q1KL\",\n" +
            "         \"next_investment_on\":\"2017-01-04\"\n" +
            "      }\n" +
            "   ],\n" +
            "   \"settings\":{  \n" +
            "      \"tips_enabled\":true,\n" +
            "      \"push_enabled\":true,\n" +
            "      \"remind_days\":2,\n" +
            "      \"summary_day\":\"saturday\"\n" +
            "   },\n" +
            "   \"totals\":{  \n" +
            "      \"p_current_value\":1231,\n" +
            "      \"p_net_gain\":31\n" +
            "   },\n" +
            "   \"fatca_updated\":true,\n" +
            "   \"mobile\":\"9581331040\",\n" +
            "   \"level\":80\n" +
            "}";

    public static final String sqrrlAwayMultipleTxns = "{  \n" +
            "   \"pan_updated\":true,\n" +
            "   \"level_display\":\"FATCA_UPDATED\",\n" +
            "   \"is_kyc_verified\":true,\n" +
            "   \"mobile_verified\":true,\n" +
            "   \"tips\":[  \n" +
            "      \"General tip text 1\",\n" +
            "      \"General tip text 2\",\n" +
            "      \"General tip text 3\",\n" +
            "      \"General tip text 4\"\n" +
            "   ],\n" +
            "   \"email\":\"m@gmail.c\",\n" +
            "   \"bank_updated\":true,\n" +
            "   \"name\":\"Paan Singh\",\n" +
            "   \"investments\":[  \n" +
            "      {  \n" +
            "         \"target_completion_on\":null,\n" +
            "         \"product_id\":1,\n" +
            "         \"display_name\":\"Sqrrl Away\",\n" +
            "         \"p_current_value\":510,\n" +
            "         \"tips\":[  \n" +
            "            \"Sqrrl Away tip 1\",\n" +
            "            \"Sqrrl Away tip 2\",\n" +
            "            \"Sqrrl Away tip 3\",\n" +
            "            \"Sqrrl Away tip 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"weekly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":500,\n" +
            "         \"group_id\":\"IGGX02Q1KL\",\n" +
            "         \"internal_name\":\"liquid\",\n" +
            "         \"target_instalment_amount\":500,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":null,\n" +
            "         \"description\":null,\n" +
            "         \"p_net_investment\":500,\n" +
            "         \"p_net_gain_percentage\":2,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TG1DZX1G3Q\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGGX02Q1KL\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"retry_transaction\":{\n" +
            "         \t\"status\": \"PENDING\",\n" +
            "         \t\"amount\": 2000\n" +
            "         },\n" +
            "         \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8GNL\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":10,\n" +
            "         \"total_target_amount\":null\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_completion_on\":\"2020-05-16\",\n" +
            "         \"product_id\":2,\n" +
            "         \"display_name\":\"BYOD\",\n" +
            "         \"p_current_value\":2750,\n" +
            "         \"tips\":[  \n" +
            "            \"BYOD tip text 1\",\n" +
            "            \"BYOD tip text 2\",\n" +
            "            \"BYOD tip text 3\",\n" +
            "            \"BYOD tip text 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":0,\n" +
            "         \"group_id\":\"IG3DPY2LP8\",\n" +
            "         \"internal_name\":\"goal_based\",\n" +
            "         \"target_instalment_amount\":1000,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":42,\n" +
            "         \"description\":\"Harley\",\n" +
            "         \"p_net_investment\":2500,\n" +
            "         \"p_net_gain_percentage\":null,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":1000,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":1500,\n" +
            "               \"group_id\":\"TGXEQ9DRQ2\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"retry_transaction\":{\n" +
            "         \t\"status\": \"PENDING\",\n" +
            "         \t\"amount\": 2000\n" +
            "         },\n" +
            "      \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8GNL\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":250,\n" +
            "         \"total_target_amount\":30000\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_completion_on\":\"2017-03-03\",\n" +
            "         \"product_id\":3,\n" +
            "         \"display_name\":\"Axe Tax\",\n" +
            "         \"p_current_value\":721,\n" +
            "         \"tips\":[  \n" +
            "            \"Axe Tax tip text 1\",\n" +
            "            \"Axe Tax tip text 2\",\n" +
            "            \"Axe Tax tip text 3\",\n" +
            "            \"Axe Tax tip text 4\"\n" +
            "         ],\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_total_investment\":700,\n" +
            "         \"group_id\":\"IG1DZX108G\",\n" +
            "         \"internal_name\":\"tax_saving\",\n" +
            "         \"target_instalment_amount\":null,\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"target_instalment_count\":3,\n" +
            "         \"description\":null,\n" +
            "         \"p_net_investment\":700,\n" +
            "         \"p_net_gain_percentage\":3,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":500,\n" +
            "               \"group_id\":\"TGDYRX50OY\"\n" +
            "            },\n" +
            "            {  \n" +
            "               \"status\":\"SUCCESS\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"group_amount\":700,\n" +
            "               \"group_id\":\"TG1DZX108G\"\n" +
            "            }\n" +
            "         ],\n" +
            "         \"upcoming_transaction\": \n" +
            "      {\n" +
            "       \"group_id\": \"IGRK6E8GNL\",\n" +
            "         \"target_instalment_amount\": 5000,\n" +
            "         \"next_investment_on\": \"2017-03-06\"\n" +
            "         },\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"p_net_gain\":14,\n" +
            "         \"total_target_amount\":2000\n" +
            "      }\n" +
            "   ],\n" +
            "   \"id\":\"CJJGE28ZY\",\n" +
            "   \"processing_transactions\":[  \n" +
            "      {  \n" +
            "         \"product_display_name\":\"Axe Tax\",\n" +
            "         \"product_id\":3,\n" +
            "         \"group_amount\":700,\n" +
            "         \"group_id\":\"TG1DZX108G\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":580\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Sqrrl Away\",\n" +
            "         \"product_id\":1,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TG1DZX1G3Q\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":579\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Axe Tax\",\n" +
            "         \"product_id\":3,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TGDYRX50OY\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":580\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"Sqrrl Away\",\n" +
            "         \"product_id\":1,\n" +
            "         \"group_amount\":500,\n" +
            "         \"group_id\":\"TGGX02Q1KL\",\n" +
            "         \"investment_description\":null,\n" +
            "         \"investment\":579\n" +
            "      },\n" +
            "      {  \n" +
            "         \"product_display_name\":\"BYOD\",\n" +
            "         \"product_id\":2,\n" +
            "         \"group_amount\":554,\n" +
            "         \"group_id\":\"TGXEQ9DRQ2\",\n" +
            "         \"investment_description\":\"Harley\",\n" +
            "         \"investment\":582\n" +
            "      }\n" +
            "   ],\n" +
            "   \"upcoming_transactions\":[  \n" +
            "      {  \n" +
            "         \"target_instalment_amount\":null,\n" +
            "         \"group_id\":\"IG1DZX108G\",\n" +
            "         \"next_investment_on\":\"2017-01-02\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_instalment_amount\":1000,\n" +
            "         \"group_id\":\"IG3DPY2LP8\",\n" +
            "         \"next_investment_on\":\"2017-01-02\"\n" +
            "      },\n" +
            "      {  \n" +
            "         \"target_instalment_amount\":500,\n" +
            "         \"group_id\":\"IGGX02Q1KL\",\n" +
            "         \"next_investment_on\":\"2017-01-04\"\n" +
            "      }\n" +
            "   ],\n" +
            "   \"settings\":{  \n" +
            "      \"tips_enabled\":true,\n" +
            "      \"push_enabled\":true,\n" +
            "      \"remind_days\":2,\n" +
            "      \"summary_day\":\"saturday\"\n" +
            "   },\n" +
            "   \"totals\":{  \n" +
            "      \"p_current_value\":1231,\n" +
            "      \"p_net_gain\":31\n" +
            "   },\n" +
            "   \"fatca_updated\":true,\n" +
            "   \"mobile\":\"9581331040\",\n" +
            "   \"level\":80\n" +
            "}";

    public static final String fatcaUpdated = "{\n" +
            "    \"id\": \"CDLDLYDN5\",\n" +
            "    \"pan_updated\": true,\n" +
            "    \"mobile\": \"8882650738\",\n" +
            "    \"settings\": {\n" +
            "        \"tips_enabled\": true,\n" +
            "        \"push_enabled\": true,\n" +
            "        \"summary_day\": \"saturday\",\n" +
            "        \"remind_days\": 2\n" +
            "    },\n" +
            "    \"investments\": [\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 1,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "    \"is_kyc_verified\": true,\n" +
            "    \"tips\": [],\n" +
            "    \"level_display\": \"CONTACT_UPDATED\",\n" +
            "    \"processing_transactions\": [],\n" +
            "    \"mobile_verified\": true,\n" +
            "    \"fatca_updated\": true,\n" +
            "    \"level\": 10,\n" +
            "    \"name\": \"Shalini\",\n" +
            "    \"bank_updated\": true,\n" +
            "    \"email\": \"shalini@sahay.co\",\n" +
            "    \"totals\": {\n" +
            "        \"p_current_value\": null,\n" +
            "        \"p_net_gain\": null\n" +
            "    },\n" +
            "    \"upcoming_transactions\": []\n" +
            "}\n";

    public static final String bankUpdated = "{\n" +
            "    \"id\": \"CDLDLYDN5\",\n" +
            "    \"pan_updated\": true,\n" +
            "    \"mobile\": \"8882650738\",\n" +
            "    \"settings\": {\n" +
            "        \"tips_enabled\": true,\n" +
            "        \"push_enabled\": true,\n" +
            "        \"summary_day\": \"saturday\",\n" +
            "        \"remind_days\": 2\n" +
            "    },\n" +
            "    \"investments\": [\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 1,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "    \"is_kyc_verified\": true,\n" +
            "    \"tips\": [],\n" +
            "    \"level_display\": \"CONTACT_UPDATED\",\n" +
            "    \"processing_transactions\": [],\n" +
            "    \"mobile_verified\": true,\n" +
            "    \"fatca_updated\": false,\n" +
            "    \"level\": 10,\n" +
            "    \"name\": \"Shalini\",\n" +
            "    \"bank_updated\": true,\n" +
            "    \"email\": \"shalini@sahay.co\",\n" +
            "    \"totals\": {\n" +
            "        \"p_current_value\": null,\n" +
            "        \"p_net_gain\": null\n" +
            "    },\n" +
            "    \"upcoming_transactions\": []\n" +
            "}\n";

    public static final String kycOk = "{\n" +
            "    \"id\": \"CDLDLYDN5\",\n" +
            "    \"pan_updated\": true,\n" +
            "    \"mobile\": \"8882650738\",\n" +
            "    \"settings\": {\n" +
            "        \"tips_enabled\": true,\n" +
            "        \"push_enabled\": true,\n" +
            "        \"summary_day\": \"saturday\",\n" +
            "        \"remind_days\": 2\n" +
            "    },\n" +
            "    \"investments\": [\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 1,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "    \"is_kyc_verified\": true,\n" +
            "    \"tips\": [],\n" +
            "    \"level_display\": \"CONTACT_UPDATED\",\n" +
            "    \"processing_transactions\": [],\n" +
            "    \"mobile_verified\": true,\n" +
            "    \"fatca_updated\": false,\n" +
            "    \"level\": 10,\n" +
            "    \"name\": \"Shalini\",\n" +
            "    \"bank_updated\": false,\n" +
            "    \"email\": \"shalini@sahay.co\",\n" +
            "    \"totals\": {\n" +
            "        \"p_current_value\": null,\n" +
            "        \"p_net_gain\": null\n" +
            "    },\n" +
            "    \"upcoming_transactions\": []\n" +
            "}\n";

    public static final String panUpdated = "{\n" +
            "  \"id\": \"CDLDLYDN5\",\n" +
            "  \"pan_updated\": true,\n" +
            "  \"mobile\": \"8882650738\",\n" +
            "  \"settings\": {\n" +
            "    \"tips_enabled\": true,\n" +
            "    \"push_enabled\": true,\n" +
            "    \"summary_day\": \"saturday\",\n" +
            "    \"remind_days\": 2\n" +
            "  },\n" +
            "  \"investments\": [\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 1,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "  \"is_kyc_verified\": false,\n" +
            "  \"tips\": [],\n" +
            "  \"level_display\": \"CONTACT_UPDATED\",\n" +
            "  \"processing_transactions\": [],\n" +
            "  \"mobile_verified\": true,\n" +
            "  \"fatca_updated\": false,\n" +
            "  \"level\": 10,\n" +
            "  \"name\": \"Shalini\",\n" +
            "  \"bank_updated\": false,\n" +
            "  \"email\": \"shalini@sahay.co\",\n" +
            "  \"totals\": {\n" +
            "    \"p_current_value\": null,\n" +
            "    \"p_net_gain\": null\n" +
            "  },\n" +
            "  \"upcoming_transactions\": []\n" +
            "}\n";

    public static final String firstTimeUser = "{\n" +
            "  \"id\": \"CDLDLYDN5\",\n" +
            "  \"pan_updated\": false,\n" +
            "  \"mobile\": \"8882650738\",\n" +
            "  \"settings\": {\n" +
            "    \"tips_enabled\": true,\n" +
            "    \"push_enabled\": true,\n" +
            "    \"summary_day\": \"saturday\",\n" +
            "    \"remind_days\": 2\n" +
            "  },\n" +
            "  \"investments\": [\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 1,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "  \"is_kyc_verified\": false,\n" +
            "  \"tips\": [],\n" +
            "  \"level_display\": \"CONTACT_UPDATED\",\n" +
            "  \"processing_transactions\": [],\n" +
            "  \"mobile_verified\": true,\n" +
            "  \"fatca_updated\": false,\n" +
            "  \"level\": 10,\n" +
            "  \"name\": \"Shalini\",\n" +
            "  \"bank_updated\": false,\n" +
            "  \"email\": \"shalini@sahay.co\",\n" +
            "  \"totals\": {\n" +
            "    \"p_current_value\": null,\n" +
            "    \"p_net_gain\": null\n" +
            "  },\n" +
            "  \"upcoming_transactions\": []\n" +
            "}\n";

    public static final String sqrrlAwayTxnSuccess = "{\n" +
            "    \"id\": \"CDLDLYDN5\",\n" +
            "    \"pan_updated\": true,\n" +
            "    \"mobile\": \"8882650738\",\n" +
            "    \"settings\": {\n" +
            "        \"tips_enabled\": true,\n" +
            "        \"push_enabled\": true,\n" +
            "        \"summary_day\": \"saturday\",\n" +
            "        \"remind_days\": 2\n" +
            "    },\n" +
            "    \"investments\": [\n" +
            "    {\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"p_total_investment\": 0,\n" +
            "      \"product_id\": 1,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"target_instalment_amount\": 5000,\n" +
            "      \"tips\": [],\n" +
            "      \"p_net_gain\": 10.65,\n" +
            "      \"instalment_period\": \"weekly\",\n" +
            "      \"p_available_withdrawal_balance\": 5010.65,\n" +
            "      \"group_id\": \"IGRK6E8GNL\",\n" +
            "      \"p_current_value\": 5010.65,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_net_gain_percentage\": 2.13,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"completed_instalment_count\": 1,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"internal_name\": \"liquid\",\n" +
            "      \"display_name\": \"Sqrrl Away\",\n" +
            "      \"recent_transactions\": [\n" +
            "        {\n" +
            "          \"group_id\": \"TG971D5835\",\n" +
            "          \"group_amount\": 5000,\n" +
            "          \"transaction_type\": \"INVEST\",\n" +
            "          \"status\": \"SUCCESS\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 2,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"goal_based\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"BYOD\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"group_id\": null,\n" +
            "      \"target_instalment_amount\": null,\n" +
            "      \"instalment_period\": null,\n" +
            "      \"p_net_gain_percentage\": null,\n" +
            "      \"p_total_investment\": null,\n" +
            "      \"product_id\": 3,\n" +
            "      \"completed_instalment_count\": null,\n" +
            "      \"total_withdrawal_count\": null,\n" +
            "      \"target_completion_on\": null,\n" +
            "      \"p_total_withdrawal\": null,\n" +
            "      \"p_net_investment\": null,\n" +
            "      \"total_target_amount\": null,\n" +
            "      \"p_current_value\": null,\n" +
            "      \"internal_name\": \"tax_saving\",\n" +
            "      \"p_net_gain\": null,\n" +
            "      \"display_name\": \"Axe Tax\",\n" +
            "      \"estimated_completion_on\": null,\n" +
            "      \"target_instalment_count\": null,\n" +
            "      \"p_available_withdrawal_balance\": null,\n" +
            "      \"description\": null\n" +
            "    }\n" +
            "  ],\n" +
            "    \"is_kyc_verified\": true,\n" +
            "    \"tips\": [],\n" +
            "    \"level_display\": \"CONTACT_UPDATED\",\n" +
            "    \"processing_transactions\": [],\n" +
            "    \"mobile_verified\": true,\n" +
            "    \"fatca_updated\": true,\n" +
            "    \"level\": 10,\n" +
            "    \"name\": \"Shalini\",\n" +
            "    \"bank_updated\": true,\n" +
            "    \"email\": \"shalini@sahay.co\",\n" +
            "    \"totals\": {\n" +
            "        \"p_current_value\": 5010.65,\n" +
            "        \"p_net_gain\": 10.65\n" +
            "    },\n" +
            "    \"upcoming_transactions\": []\n" +
            "}";

    public static final String dhan = "{\n" +
            "   \"id\":\"COW7RP5W4\",\n" +
            "   \"mobile_verified\":true,\n" +
            "   \"name\":\"sksjsjsj\",\n" +
            "   \"settings\":{  \n" +
            "      \"remind_days\":2,\n" +
            "      \"summary_day\":\"saturday\",\n" +
            "      \"tips_enabled\":true,\n" +
            "      \"push_enabled\":true\n" +
            "   },\n" +
            "   \"is_kyc_verified\":true,\n" +
            "   \"email\":\"ndjdjdj@hsjsj.kd\",\n" +
            "   \"pan_updated\":true,\n" +
            "   \"level_display\":\"PAN_UPDATED\",\n" +
            "   \"mobile\":\"9985406771\",\n" +
            "   \"tips\":[  \n" +
            "      \"General tip text 1KISS\",\n" +
            "      \"General tip text 2\",\n" +
            "      \"General tip text 3\",\n" +
            "      \"General tip text 4\"\n" +
            "   ],\n" +
            "   \"level\":20,\n" +
            "   \"fatca_updated\":true,\n" +
            "   \"totals\":{  \n" +
            "      \"p_net_gain\":null,\n" +
            "      \"p_current_value\":null\n" +
            "   },\n" +
            "   \"bank_updated\":true,\n" +
            "   \"investments\":[  \n" +
            "      {  \n" +
            "         \"display_name\":\"Sqrrl Away\",\n" +
            "         \"upcoming_transaction\":{  \n" +
            "            \"group_id\":\"IGWEWEXZJX\",\n" +
            "            \"next_investment_on\":\"2017-01-03\",\n" +
            "            \"target_instalment_amount\":1000\n" +
            "         },\n" +
            "         \"total_target_amount\":null,\n" +
            "         \"target_instalment_count\":null,\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_net_gain_percentage\":null,\n" +
            "         \"p_total_investment\":0,\n" +
            "         \"tips\":[  \n" +
            "            \"Sqrrl Away tip 1\",\n" +
            "            \"Sqrrl Away tip 2\",\n" +
            "            \"Sqrrl Away tip 3\",\n" +
            "            \"Sqrrl Away tip 4\"\n" +
            "         ],\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"internal_name\":\"liquid\",\n" +
            "         \"group_id\":\"IGWEWEXZJX\",\n" +
            "         \"product_id\":1,\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_available_withdrawal_balance\":0.00,\n" +
            "         \"retry_transaction\":null,\n" +
            "         \"target_completion_on\":null,\n" +
            "         \"target_instalment_amount\":1000,\n" +
            "         \"description\":null,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"group_id\":\"TGZRL0QREX\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"group_amount\":500\n" +
            "            }\n" +
            "         ],\n" +
            "         \"p_net_investment\":null,\n" +
            "         \"p_net_gain\":null,\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"instalment_period\":\"weekly\",\n" +
            "         \"p_current_value\":0.00\n" +
            "      },\n" +
            "      {  \n" +
            "         \"display_name\":\"BYOD\",\n" +
            "         \"upcoming_transaction\":{  \n" +
            "            \"group_id\":\"IGYKPKO5YR\",\n" +
            "            \"next_investment_on\":\"2017-01-03\",\n" +
            "            \"target_instalment_amount\":500\n" +
            "         },\n" +
            "         \"total_target_amount\":30000,\n" +
            "         \"target_instalment_count\":60,\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_net_gain_percentage\":null,\n" +
            "         \"p_total_investment\":0,\n" +
            "         \"tips\":[  \n" +
            "            \"BYOD tip text 1\",\n" +
            "            \"BYOD tip text 2\",\n" +
            "            \"BYOD tip text 3\",\n" +
            "            \"BYOD tip text 4\"\n" +
            "         ],\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"internal_name\":\"goal_based\",\n" +
            "         \"group_id\":\"IGYKPKO5YR\",\n" +
            "         \"product_id\":2,\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"retry_transaction\":null,\n" +
            "         \"target_completion_on\":\"2021-11-08\",\n" +
            "         \"target_instalment_amount\":500,\n" +
            "         \"description\":\"jhumri tilaiya\",\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"group_id\":\"TGVP2QW8RX\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"group_amount\":1000\n" +
            "            }\n" +
            "         ],\n" +
            "         \"p_net_investment\":null,\n" +
            "         \"p_net_gain\":null,\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"p_current_value\":null\n" +
            "      },\n" +
            "      {  \n" +
            "         \"display_name\":\"Axe Tax\",\n" +
            "         \"upcoming_transaction\":{  \n" +
            "            \"group_id\":\"IGL0N0YQZ0\",\n" +
            "            \"next_investment_on\":\"2017-01-03\",\n" +
            "            \"target_instalment_amount\":null\n" +
            "         },\n" +
            "         \"total_target_amount\":5000,\n" +
            "         \"target_instalment_count\":1,\n" +
            "         \"p_total_withdrawal\":null,\n" +
            "         \"p_net_gain_percentage\":null,\n" +
            "         \"p_total_investment\":0,\n" +
            "         \"tips\":[  \n" +
            "            \"Axe Tax tip text 1\",\n" +
            "            \"Axe Tax tip text 2\",\n" +
            "            \"Axe Tax tip text 3\",\n" +
            "            \"Axe Tax tip text 4\"\n" +
            "         ],\n" +
            "         \"total_withdrawal_count\":null,\n" +
            "         \"internal_name\":\"tax_saving\",\n" +
            "         \"group_id\":\"IGL0N0YQZ0\",\n" +
            "         \"product_id\":3,\n" +
            "         \"completed_instalment_count\":null,\n" +
            "         \"p_available_withdrawal_balance\":null,\n" +
            "         \"retry_transaction\":null,\n" +
            "         \"target_completion_on\":\"2017-01-03\",\n" +
            "         \"target_instalment_amount\":null,\n" +
            "         \"description\":null,\n" +
            "         \"recent_transactions\":[  \n" +
            "            {  \n" +
            "               \"group_id\":\"TG04Y2Q87Q\",\n" +
            "               \"transaction_type\":\"INVEST\",\n" +
            "               \"status\":\"PROCESSING\",\n" +
            "               \"group_amount\":2000\n" +
            "            }\n" +
            "         ],\n" +
            "         \"p_net_investment\":null,\n" +
            "         \"p_net_gain\":null,\n" +
            "         \"estimated_completion_on\":null,\n" +
            "         \"instalment_period\":\"monthly\",\n" +
            "         \"p_current_value\":null\n" +
            "      }\n" +
            "   ]\n" +
            "}";

    public static final String fetch_all_transactions = "[\n" +
            "  {\n" +
            "    \"group_id\": \"TGVP2EN7KO\",\n" +
            "    \"created_on\": \"2017-01\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 700\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 800\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"REDEEM\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 900\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"REDEEM\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 1000\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-11\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 500\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-11\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 600\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-11\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 1100\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"REDEEM\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 800\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"REDEEM\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 900\n" +
            "  },\n" +
            "  {\n" +
            "    \"group_id\": \"TGOW701KXQ\",\n" +
            "    \"created_on\": \"2016-10\",\n" +
            "    \"transaction_type\": \"INVEST\",\n" +
            "    \"status\": \"PROCESSING\",\n" +
            "    \"group_amount\": 1000\n" +
            "  }\n" +
            "]";

    public static final String trans = "[  \n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGGNPY2D7E\",\n" +
            "      \"group_amount\":2000.00,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-17T00:00:00\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGOW77QY7O\",\n" +
            "      \"group_amount\":5300,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T11:09:48.023934\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGD9RR1OGW\",\n" +
            "      \"group_amount\":2000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T11:05:03.456100\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGOW775YPJ\",\n" +
            "      \"group_amount\":5000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T07:16:04.031959\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0N4WOR8\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-13T11:26:27.472548\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0N4WZNP\",\n" +
            "      \"group_amount\":40000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-13T09:43:35.386526\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG5R2E5GO2\",\n" +
            "      \"group_amount\":200000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-08T09:09:54.558345\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGD9R184RO\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-06T06:21:39.670507\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG1RZD84G4\",\n" +
            "      \"group_amount\":175000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-31T08:06:08.682626\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGK9VGL20L\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:37:23.909585\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG84G5K0N8\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:34:45.679734\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGWEWGD80Z\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:32:17.009205\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0NGKP22\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:31:55.535615\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG1RZ59V1E\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:21:32.036077\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGRWJGPNN1\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:31.358622\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGNWD1XGGV\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:21.938303\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGVP2GQ99Z\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:20.350196\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGJJGRWXR6\",\n" +
            "      \"group_amount\":3000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:12:26.370574\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGQW0XP58Z\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:09:10.903568\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGXE8P7QY4\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:08:41.734103\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGPW9GP2RP\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:08:34.119434\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGPW9XP7OP\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T11:58:58.422527\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGYKPVQN17\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T09:05:33.821697\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG24RL2074\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T08:24:55.059592\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGZRLNDGRL\",\n" +
            "      \"group_amount\":300000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T07:34:18.971335\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG428LNOGE\",\n" +
            "      \"group_amount\":300000,\n" +
            "      \"status\":\"FAILURE\",\n" +
            "      \"created_on\":\"2017-01-23T07:27:46.256010\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGZRL0QREX\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-16T10:47:38.546811\"\n" +
            "   }\n" +
            "]";

    public static final String gas = "[{  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGOW77QY7O\",\n" +
            "      \"group_amount\":5300,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T00:00:00.00\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGD9RR1OGW\",\n" +
            "      \"group_amount\":2000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T11:05:03.456100\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGOW775YPJ\",\n" +
            "      \"group_amount\":5000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-16T07:16:04.031959\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0N4WOR8\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-13T11:26:27.472548\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0N4WZNP\",\n" +
            "      \"group_amount\":40000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-13T09:43:35.386526\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG5R2E5GO2\",\n" +
            "      \"group_amount\":200000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-08T09:09:54.558345\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGD9R184RO\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-02-06T06:21:39.670507\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG1RZD84G4\",\n" +
            "      \"group_amount\":175000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-31T08:06:08.682626\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGK9VGL20L\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:37:23.909585\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG84G5K0N8\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:34:45.679734\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGWEWGD80Z\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:32:17.009205\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGL0NGKP22\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:31:55.535615\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TG1RZ59V1E\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:21:32.036077\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGRWJGPNN1\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:31.358622\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGNWD1XGGV\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:21.938303\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGVP2GQ99Z\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T10:03:20.350196\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGJJGRWXR6\",\n" +
            "      \"group_amount\":3000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:12:26.370574\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGQW0XP58Z\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:09:10.903568\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGXE8P7QY4\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:08:41.734103\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"REDEEM\",\n" +
            "      \"group_id\":\"TGPW9GP2RP\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-27T09:08:34.119434\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGPW9XP7OP\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T11:58:58.422527\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGYKPVQN17\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T09:05:33.821697\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG24RL2074\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T08:24:55.059592\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGZRLNDGRL\",\n" +
            "      \"group_amount\":300000,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-23T07:34:18.971335\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TG428LNOGE\",\n" +
            "      \"group_amount\":300000,\n" +
            "      \"status\":\"FAILURE\",\n" +
            "      \"created_on\":\"2017-01-23T07:27:46.256010\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"transaction_type\":\"INVEST\",\n" +
            "      \"group_id\":\"TGZRL0QREX\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"created_on\":\"2017-01-16T10:47:38.546811\"\n" +
            "   }\n" +
            "]";

    public static final String adi_trans = "[  \n" +
            "   {  \n" +
            "      \"group_id\":\"TGD9R0WRXW\",\n" +
            "      \"group_amount\":100000,\n" +
            "      \"created_on\":\"2017-02-20T05:55:03.134388\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGWEW4QDVK\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"created_on\":\"2017-02-13T11:15:36.815922\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGQW04GYW0\",\n" +
            "      \"group_amount\":50000,\n" +
            "      \"created_on\":\"2017-02-13T09:58:18.650517\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGL0N40P82\",\n" +
            "      \"group_amount\":50000,\n" +
            "      \"created_on\":\"2017-02-11T07:32:42.958642\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGYKP5RYJQ\",\n" +
            "      \"group_amount\":60000,\n" +
            "      \"created_on\":\"2017-02-10T05:21:21.897993\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGPW9D4EGP\",\n" +
            "      \"group_amount\":2000,\n" +
            "      \"created_on\":\"2017-02-09T06:48:34.140778\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGXE8R8JZD\",\n" +
            "      \"group_amount\":1000,\n" +
            "      \"created_on\":\"2017-02-09T05:10:45.067746\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGD9RWQ44O\",\n" +
            "      \"group_amount\":50000,\n" +
            "      \"created_on\":\"2017-02-03T05:20:27.084929\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGL0NQPLZ5\",\n" +
            "      \"group_amount\":500.00,\n" +
            "      \"created_on\":\"2017-02-02T08:00:15.629514\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGL0NQPLZ5\",\n" +
            "      \"group_amount\":100.00,\n" +
            "      \"created_on\":\"2017-02-02T08:00:15.498313\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGGNPR8OZ8\",\n" +
            "      \"group_amount\":30000,\n" +
            "      \"created_on\":\"2017-02-01T06:51:29.297169\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGD9RE1GOP\",\n" +
            "      \"group_amount\":499.39,\n" +
            "      \"created_on\":\"2017-02-01T02:54:11.843893\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGPW90Z40P\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"created_on\":\"2017-01-30T10:48:58.394019\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGRK7JY0GR\",\n" +
            "      \"group_amount\":100,\n" +
            "      \"created_on\":\"2017-01-30T00:00:00\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGOW7K298Q\",\n" +
            "      \"group_amount\":5000,\n" +
            "      \"created_on\":\"2017-01-28T11:51:04.892666\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGL0NG4ZX8\",\n" +
            "      \"group_amount\":5000,\n" +
            "      \"created_on\":\"2017-01-28T09:36:27.845312\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGXE8P7J4W\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"created_on\":\"2017-01-27T10:02:01.927963\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"REDEEM\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGK9VGKLQL\",\n" +
            "      \"group_amount\":20000.00,\n" +
            "      \"created_on\":\"2017-01-26T05:37:47.433775\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGD9R5OGEP\",\n" +
            "      \"group_amount\":30000,\n" +
            "      \"created_on\":\"2017-01-26T04:53:47.703065\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGL0NRW54O\",\n" +
            "      \"group_amount\":1000.00,\n" +
            "      \"created_on\":\"2017-01-25T07:18:59.665558\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TGK9VZ0OY5\",\n" +
            "      \"group_amount\":6000,\n" +
            "      \"created_on\":\"2017-01-23T08:19:51.231856\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   },\n" +
            "   {  \n" +
            "      \"group_id\":\"TG1RZ9Q5DE\",\n" +
            "      \"group_amount\":500,\n" +
            "      \"created_on\":\"2017-01-14T09:51:32.778368\",\n" +
            "      \"status\":\"SUCCESS\",\n" +
            "      \"transaction_type\":\"INVEST\"\n" +
            "   }\n" +
            "]";
}
