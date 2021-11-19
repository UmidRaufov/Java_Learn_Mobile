package com.example.javalearnmobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Splash oynadan Intro oynaga o'tish
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            /*TODO: Boshqa oynaga otganda orqa tugmani bosganimizda
                orqadagi oyna ishga tushmasligi uchun kerak bolmasa u oynani
                    yoqotib yuborgan maqul */
            finish();
            fileList();
        }, 2500);
    }
}