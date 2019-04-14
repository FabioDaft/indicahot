package com.example.indicahot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oferta = (Button) findViewById(R.id.btn_ofer);
        oferta.setOnClickListener(this);

        Button rec = (Button) findViewById(R.id.btn_rec);
        rec.setOnClickListener(this);

        Button logout = (Button) findViewById(R.id.btn_sair_main);
        logout.setOnClickListener(this);
    }

    public void onClick(View click) {

        switch (click.getId()) {

            case R.id.btn_ofer:
                Intent ofer = new Intent(this, Ofertas.class);
                startActivity(ofer);
                break;

            case R.id.btn_rec:
                Intent rec = new Intent(this, Recomendados.class);
                startActivity(rec);
                break;

            case R.id.btn_sair_main:
                Intent logout = new Intent (this,Login.class);
                startActivity(logout);
                break;
        }


    }
}
