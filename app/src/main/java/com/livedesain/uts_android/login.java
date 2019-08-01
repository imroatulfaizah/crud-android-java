package com.livedesain.uts_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by USER on 15/04/2018.
 */

public class login extends AppCompatActivity {

    EditText user, pass;
    Button btnLogin, btnRegis;
    String userName, Password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_login);

        userName = (getIntent().getStringExtra("username"));
        Password = (getIntent().getStringExtra("password"));

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegis = (Button) findViewById(R.id.btn_register);
        user = (EditText) findViewById(R.id.username_login);
        pass = (EditText) findViewById(R.id.password_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });

    }

    public void login(){
        String User = user.getText().toString().trim();
        String pass1 = pass.getText().toString().trim();

        if (User.equals(userName) && pass1.equals(Password)){
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(login.this, utama.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Username / Password salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view){
        Intent intent2 = new Intent(login.this, register.class);
        startActivity(intent2);
    }

}
