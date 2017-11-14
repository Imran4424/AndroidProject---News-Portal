package com.example.imu.broughttoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void sHome(View view) {
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

    public void sAboard(View view) {
        Intent intent = new Intent(this,Aboard.class);
        startActivity(intent);
    }

    public void sePoli(View view) {
        Intent intent = new Intent(this,Politics.class);
        startActivity(intent);
    }

    public void seSC(View view) {
        Intent intent = new Intent(this,Science.class);
        startActivity(intent);
    }

    public void seSP(View view) {
        Intent intent = new Intent(this,Sports.class);
        startActivity(intent);
    }

    public void seBusi(View view) {
        Intent intent = new Intent(this,Business.class);
        startActivity(intent);
    }
}
