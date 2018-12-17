package com.example.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.testandroid.data.ApiClient;
import com.example.testandroid.data.ApiService;
import com.example.testandroid.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    Toolbar toolbar;
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apiService = ApiClient.getClient().create(ApiService.class);

    }
    public void signup(View view){
        Intent intent= new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        EditText email = findViewById(R.id.loginEmail);
        EditText password = findViewById(R.id.loginPassword);

        Call<LoginResponse> call = apiService.postLoginData(email.getText().toString(), password.getText().toString(), "Bearrer");
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Log.i("### LIANA", "onResponse login: " + response.body().username);
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }
}
