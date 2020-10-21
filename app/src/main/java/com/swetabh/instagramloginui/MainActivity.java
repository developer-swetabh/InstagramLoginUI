package com.swetabh.instagramloginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    RelativeLayout mRelLogin, mRelSignUp;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //My two Relative Layouts
            mRelLogin.setVisibility(View.VISIBLE);
            mRelSignUp.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        mRelLogin = (RelativeLayout) findViewById(R.id.rel_login);
        mRelSignUp = (RelativeLayout) findViewById(R.id.rel_signup);

        handler.postDelayed(runnable, 2000);
        //This is delay for timeout
    }
}