package com.example.indicahot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       Button entrar = (Button) findViewById(R.id.btn_entrar);
        entrar.setOnClickListener(this);

        Button cadastro = (Button) findViewById(R.id.bnt_cadastrar);
        cadastro.setOnClickListener(this);
    }

    @Override
    public void onClick(View click) {

        switch (click.getId()) {

            case R.id.btn_entrar:
                Intent entre = new Intent(this, Principal.class);
                startActivity(entre);
                break;

            case R.id.bnt_cadastrar:
                Intent cad = new Intent(this, Cadastrar.class);
                startActivity(cad);
                break;
        }


    }
}
