package com.example.sridhar123.sieaver;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;

import java.util.ArrayList;

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

    public static ArrayList<String> createSqrrlAwayPickerValues(int beginValue, int endValue, int stepValue) {
        int size = ((endValue - beginValue) / stepValue) + 1;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(addSeparators(beginValue + i * stepValue));
        }
        list.add(0, "500");
        return list;
    }

    public static PickerValues createBeaverAwayPickerValuesWithCustom(int beginValue, int endValue, int stepValue, int customValue) {
        ArrayList<String> list = new ArrayList<>();
        PickerValues pickerValues = new PickerValues();
        int size = ((endValue - beginValue) / stepValue) + 1;
        for (int i = 0; i < size; i++) {
            int value = (beginValue + i * stepValue);
            if (i == 0 && customValue < value) {
                list.add(addSeparators(customValue));
                list.add(addSeparators(value));
            } else if (i == size - 1 && customValue > value) {
                list.add(addSeparators(value));
                list.add(addSeparators(customValue));
            } else {
                int nextValue = (beginValue + (i + 1) * stepValue);
                if (customValue > value && customValue < nextValue) {
                    list.add(addSeparators(value));
                    list.add(addSeparators(customValue));
                } else {
                    list.add(addSeparators(value));
                }
            }
        }
        if (!list.contains("500")) {
            list.add(0, "500");
        }
        pickerValues.setList(list);
        pickerValues.setSelectedIndex(list.indexOf(addSeparators(customValue)));

        return pickerValues;
    }
}
