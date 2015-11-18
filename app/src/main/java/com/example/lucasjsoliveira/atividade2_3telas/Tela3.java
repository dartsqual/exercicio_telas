package com.example.lucasjsoliveira.atividade2_3telas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_3);
    }

    public void closeTela(View view) {
        this.finish();
    }
}
