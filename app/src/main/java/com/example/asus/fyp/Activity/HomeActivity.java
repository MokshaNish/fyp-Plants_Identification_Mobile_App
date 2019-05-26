package com.example.asus.fyp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asus.fyp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
        public void captureImage(View view){

            Intent intent = new Intent(this,OpenCameraActivity.class);
            startActivity(intent);
        }

    public void UploadImage(View view){

        Intent intent = new Intent(this,UploadImageActivity.class);
        startActivity(intent);
    }


}
