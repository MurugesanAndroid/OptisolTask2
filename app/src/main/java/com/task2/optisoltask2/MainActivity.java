package com.task2.optisoltask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickListener listener = new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                switch (view.getId()) {
                    case R.id.service_start:
                        //starts service for the given Intent
                        startService(intent);
                        Intent intent1=new Intent(MainActivity.this,CallScreen.class);
                        startActivity(intent1);
                        break;

                }
            }
        };
        findViewById(R.id.service_start).setOnClickListener(listener);

    }
}