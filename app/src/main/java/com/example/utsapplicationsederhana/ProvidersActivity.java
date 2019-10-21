package com.example.utsapplicationsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProvidersActivity extends AppCompatActivity {

    Button mButtonCsyntax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers);

        mButtonCsyntax = (Button) findViewById(R.id.button_synproviders);

        mButtonCsyntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syntaxIntent = new Intent(ProvidersActivity.this, SyntaxProvidersActivity.class);
                startActivity(syntaxIntent);
            }
        });
    }
}
