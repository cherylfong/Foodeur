package com.cherylfong.foodeur;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

    }


    // TODO press enter to login or sign in

    // TODO autocomplete username? use AccountManager

    // TODO link to activity after login

    // TODO toast: show logged in or signed up


}
