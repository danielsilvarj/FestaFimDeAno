package com.example.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private SharedPreferences mSharedPReferences;

    public SecurityPreferences(Context mContext){

        this.mSharedPReferences = mContext.getSharedPreferences("FestaFimAno", Context.MODE_PRIVATE);


    }

    public  void storeString(String key, String value){
        this.mSharedPReferences.edit().putString(key, value).apply();
    }

    public String getStoredString(String key){
        return this.mSharedPReferences.getString(key, "");
    }

}
