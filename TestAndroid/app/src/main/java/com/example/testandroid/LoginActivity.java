package com.example.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar=(Toolbar) findViewById(R.id.toolbar);

    }
    public void signup(View view){
        Intent intent= new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}
