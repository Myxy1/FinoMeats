package com.example.petrik.finommeats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonRendeles, buttonInformacio, buttonKapcsolat;
    private View informacioLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(0xFFFFFFFF,
                WindowManager.LayoutParams.FLAG_FULLSCREEN | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        buttonRendeles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent rendeles = new Intent(MainActivity.this, Rendeles.class);
                startActivity(rendeles);
                finish();
            }
        });

        buttonKapcsolat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast informacio = Toast.makeText(MainActivity.this, "Toast:Gravity.TOP", Toast.LENGTH_LONG);
                informacio.setGravity(Gravity.CENTER,0,0);
                informacio.setView(informacioLayout);
                informacio.show();
            }
        });


    }


    public void init()
    {
        buttonRendeles = (Button) findViewById(R.id.buttonRendeles);
        buttonInformacio = (Button) findViewById(R.id.buttonInformacio);
        buttonKapcsolat = (Button) findViewById(R.id.buttonKapcsolat);

        LayoutInflater layoutInflater = getLayoutInflater();
        informacioLayout = layoutInflater.inflate(R.layout.kapcsolat_layout, (ViewGroup) findViewById(R.id.informacioLayout));

    }
}
