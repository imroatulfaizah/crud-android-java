package com.livedesain.uts_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    Button btn1;
    EditText text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_register);

        text1 = (EditText) findViewById(R.id.txt1);
        text2 = (EditText) findViewById(R.id.txt2);
        btn1 = (Button) findViewById(R.id.btn_regis);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, login.class);
                intent.putExtra("username", text1.getText().toString());
                intent.putExtra("password", text2.getText().toString());
                startActivity(intent);
            }
        });

    }
}
