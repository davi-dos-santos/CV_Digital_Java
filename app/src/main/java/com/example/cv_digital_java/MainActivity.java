package com.example.cv_digital_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText digitar_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        digitar_nome = (EditText) findViewById(R.id.digitar_nome);
    }

    //public void teste(View view){

      //  Toast.makeText(MainActivity.this, "Seu nome é" + digitar_nome, Toast.LENGTH_SHORT).show();

    //}
}