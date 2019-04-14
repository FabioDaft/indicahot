package com.example.indicahot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastrar extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        Button cad = (Button) findViewById(R.id.btn_cad);
        cad.setOnClickListener(this);

        Button sair = (Button) findViewById(R.id.btn_sair);
        sair.setOnClickListener(this);
    }

    public void onClick(View click) {

        switch (click.getId()) {

            case R.id.btn_cad:
                Intent cad = new Intent(this, Login.class);
                startActivity(cad);
                break;

            case R.id.btn_sair:
                Intent sair = new Intent(this, Login.class);
                startActivity(sair);
                break;
        }


    }
}
