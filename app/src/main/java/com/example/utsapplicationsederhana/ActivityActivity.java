package com.example.utsapplicationsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityActivity extends AppCompatActivity {

    Button mButtonCsyntax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        mButtonCsyntax = (Button) findViewById(R.id.button_synservice);

        mButtonCsyntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syntaxIntent = new Intent(ActivityActivity.this, SyntaxActivity.class);
                startActivity(syntaxIntent);
            }
        });
    }
}
