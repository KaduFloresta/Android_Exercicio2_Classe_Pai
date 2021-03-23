package com.example.android_exercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherActivity extends AppCompatActivity {
    EditText editTextY;
    Button buttonY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        editTextY = (EditText) findViewById(R.id.editTextX);
        buttonY = (Button) findViewById(R.id.buttonY);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String message = editTextY.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", message);
                setResult(2, intent);
                finish();
            }
        });
    }
}