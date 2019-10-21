package com.example.utsapplicationsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntenActivity extends AppCompatActivity {
    Button mButtonCsyntax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten);

        mButtonCsyntax = (Button) findViewById(R.id.button_syninten);


        mButtonCsyntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syntaxIntent = new Intent(IntenActivity.this, SyntaxIntenActivity.class);
                startActivity(syntaxIntent);
            }
        });

    }
}
