package com.cherylfong.foodeur;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

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
