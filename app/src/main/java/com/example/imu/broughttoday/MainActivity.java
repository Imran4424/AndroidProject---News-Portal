package com.example.imu.broughttoday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendPa(View view) {
        Intent intent = new Intent(this,Palo.class);
        startActivity(intent);
    }

    public void sendKa(View view) {
        Intent intent = new Intent(this,KalerKontho.class);
        startActivity(intent);
    }

    public void sendGo(View view) {
        Intent intent = new Intent(this,GoActivity.class);
        startActivity(intent);
    }

    public void sendBd24(View view) {
        Intent intent = new Intent(this,Bd24News.class);
        startActivity(intent);
    }

    public void sendDS(View view) {
        Intent intent = new Intent(this,DailyStar.class);
        startActivity(intent);
    }

    public void sendGoal(View view) {
        Intent intent = new Intent(this,Goal.class);
        startActivity(intent);
    }

    public void sendESPN(View view) {
        Intent intent = new Intent(this,Espn.class);
        startActivity(intent);
    }

    public void sendCat(View view) {
        Intent intent = new Intent(this,Category.class);
        startActivity(intent);
    }
}
