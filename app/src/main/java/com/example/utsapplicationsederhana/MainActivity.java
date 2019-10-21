package com.example.utsapplicationsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButtonIntent;
    Button mButtonProviders;
    Button mButtonBroadcast;
    Button mButtonService;
    Button mButtonActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonIntent = (Button) findViewById(R.id.button_inten);
        mButtonProviders = (Button) findViewById(R.id.button_providers);
        mButtonBroadcast = (Button) findViewById(R.id.button_broadcast);
        mButtonService = (Button) findViewById(R.id.button_service);
        mButtonActivity = (Button) findViewById(R.id.button_activity);

        mButtonIntent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activityInten = new Intent(MainActivity.this,IntenActivity.class);
                startActivity(activityInten);
            }
        });

        mButtonProviders.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activityProviders = new Intent(MainActivity.this,ProvidersActivity.class);
                startActivity(activityProviders);
            }
        });

        mButtonBroadcast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activityBroadcast = new Intent(MainActivity.this,BroadcastActivity.class);
                startActivity(activityBroadcast);
            }
        });

        mButtonService.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activityService = new Intent(MainActivity.this,ServiceActivity.class);
                startActivity(activityService);
            }
        });

        mButtonActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent activityAct = new Intent(MainActivity.this,ActivityActivity.class);
                startActivity(activityAct);
            }
        });

    }
}
