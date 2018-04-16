package com.ctp.theteleprompter.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;

public class SharedPreferenceUtils {

   private static final int DEFAULT_VALUE_BACKGROUND = Color.BLACK;
    private static final int DEFAULT_VALUE_TEXT = Color.WHITE;
    private static final String DEFAULT_USERNAME = "Local";

    private static final String PREF_BACKGROUND_COLOR_KEY ="background-color-key";
    private static final String PREF_TEXT_COLOR_KEY = "text-color-key";
    private static final String PREF_USERNAME = "tele-username";

    private static final String PREF_LAST_ID = "last_od";



    public static int getDefaultBackgroundColor(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getInt(PREF_BACKGROUND_COLOR_KEY,DEFAULT_VALUE_BACKGROUND);
    }

    public static int getDefaultTextColor(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getInt(PREF_TEXT_COLOR_KEY,DEFAULT_VALUE_TEXT);
    }

    public static void setDefaultBackgroundColor(Context context, int color){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(PREF_BACKGROUND_COLOR_KEY, color);
        editor.apply();
    }

    public static void setDefaultTextColor(Context context, int color){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(PREF_TEXT_COLOR_KEY, color);
        editor.apply();
    }


    public static void setPrefUsername(Context context, String username){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(PREF_USERNAME, username);
        editor.apply();
    }


    public static String getPrefUsername(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(PREF_USERNAME,DEFAULT_USERNAME);
    }

    public static int getLastStoredId(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getInt(PREF_LAST_ID,-1);

    }

    public static void setLastStoredId(Context context, int id){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(PREF_LAST_ID, id);
        editor.apply();
    }


}
