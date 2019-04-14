package com.example.indicahot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recomendados extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiniao);
        Button backre = (Button) findViewById(R.id.btn_voltar_rec);
        backre.setOnClickListener(this);
    }

    public void onClick(View click) {

        Intent backorec = new Intent(this, Principal.class);
        startActivity(backorec);

    }
}
