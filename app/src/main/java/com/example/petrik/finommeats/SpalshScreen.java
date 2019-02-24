package com.example.petrik.finommeats;

import android.animation.Animator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class SpalshScreen extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 7000; //A betöltési időt itt lehet beállítani.
    private LottieAnimationView lottieAnimationView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(0xFFFFFFFF,
                WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpalshScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        },SPLASH_TIME_OUT);

    }
}
