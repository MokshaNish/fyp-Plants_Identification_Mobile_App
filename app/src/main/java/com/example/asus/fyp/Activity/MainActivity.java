package com.example.asus.fyp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.example.asus.fyp.R;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        onclick();


    }

    private void onclick() {
        lvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),SplashActivity.class);
                startActivity(intent);
            }
        });


    }

    private void init() {
        lvMain=(LinearLayout)findViewById(R.id.lvMain);
    }

}
