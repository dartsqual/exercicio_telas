package com.example.lucasjsoliveira.atividade2_3telas;

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

    public void openTela1(View view) {
        Intent myIntent = new Intent(MainActivity.this, Tela1.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void openTela2(View view) {
        Intent myIntent = new Intent(MainActivity.this, Tela2.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void openTela3(View view) {
        Intent myIntent = new Intent(MainActivity.this, Tela3.class);
        MainActivity.this.startActivity(myIntent);
    }
}
