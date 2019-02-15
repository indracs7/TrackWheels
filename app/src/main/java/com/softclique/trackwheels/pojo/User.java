package com.softclique.trackwheels.pojo;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    private String email,name,uid;

    public User(String email, String name, String uid) {
        this.email = email;
        this.name = name;
        this.uid = uid;
    }

    public User(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public static String getUID(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("UserInfo",Context.MODE_PRIVATE);
        return sharedPreferences.getString("uid",null);
    }
}
