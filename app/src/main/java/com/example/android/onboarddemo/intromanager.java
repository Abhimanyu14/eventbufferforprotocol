package com.example.android.onboarddemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Robo warrior on 03-02-2018.
 */

public class intromanager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;
    public intromanager(Context context)
    {
        this.context=context;
        preferences = this.context.getSharedPreferences("first",0);
        editor=preferences.edit();
    }
    public  void setFirst(boolean isfirst)
    {
        editor.putBoolean("check",isfirst);
        editor.commit();
    }
    public boolean check()
    {
        return preferences.getBoolean("check",true);
    }
}
