package com.example.sridhar123.sieaver;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;

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

    public static int getDigits(String value, Context context) {
        if (value != null && value.matches(".*\\d+.*")) {
            return Integer.parseInt(value.replaceAll("\\D+", ""));
        } else {
            return -1;
        }
    }

    public static String addSeparators(int num) {
        return addSeparators(String.valueOf(num));
    }

    public static String addSeparators(String num) {
        if (num == null || num.isEmpty())
            return "";
        boolean isAmountNegative = false;
        if (num.charAt(0) == '-') {
            isAmountNegative = true;
            num = num.substring(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        char amountArray[] = num.toCharArray();
        int a = 0, b = 0;
        for (int i = amountArray.length - 1; i >= 0; i--) {
            if (a < 3) {
                stringBuilder.append(amountArray[i]);
                a++;
            } else if (b < 2) {
                if (b == 0) {
                    stringBuilder.append(",");
                    stringBuilder.append(amountArray[i]);
                    b++;
                } else {
                    stringBuilder.append(amountArray[i]);
                    b = 0;
                }
            }
        }
        if (isAmountNegative)
            stringBuilder.append("-");
        return stringBuilder.reverse().toString();
    }

}
