package com.example.vijay.parking_allocation;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by vijay on 4/18/2017.
 */

public class SessionHandel {

    private SharedPreferences prefs;
    private static final String IS_LOGIN = "IsLoggedIn";

    public SessionHandel(Context cntx) {
        // TODO Auto-generated constructor stub
        prefs = PreferenceManager.getDefaultSharedPreferences(cntx);
    }

    public void setusername(String username) {
        prefs.edit().putString("username", username).commit();

    }

    public String getusername() {
        String username = prefs.getString("username","");
        return username;
    }

    public boolean isLoggedIn(){
        return prefs.getBoolean(IS_LOGIN, false);
    }
    public void destroySession(){
        prefs.edit().clear().commit();

    }
}
