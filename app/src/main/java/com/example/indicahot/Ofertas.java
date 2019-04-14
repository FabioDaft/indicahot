package com.example.indicahot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ofertas extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);

        Button backof = (Button) findViewById(R.id.btn_voltar_ofer);
        backof.setOnClickListener(this);
    }

    public void onClick(View click) {

        Intent backofe = new Intent(this, Principal.class);
        startActivity(backofe);

    }
}
