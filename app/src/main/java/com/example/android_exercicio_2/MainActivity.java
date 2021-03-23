package com.example.android_exercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewX;
    Button buttonX;

    @Override
    // onCreate = Quando a Activity é criada pela primeira vez
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Classe R = É responsável por fazer a comunicação entre .xml e .java.
        textViewX = (TextView) findViewById(R.id.textViewX);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonX.setOnClickListener(new View.OnClickListener() {

            // @Override = Reescrever um método que foi herdado, aonde seu comportamento na classe Pai,
            // se difere do seu comportamento na classe filha.
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivityForResult(intent, 2);// Activity com requestCode = 2
            }
        });
    }

    @Override
    // A classe Intent permite que realizemos a comunicação entre duas
    // Activities passando diferentes tipos de informações.
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2) {
            String message = data.getStringExtra("MESSAGE");
            textViewX.setText(message);
        }
    }
}