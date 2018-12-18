package com.example.testandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testandroid.R;
import com.example.testandroid.data.ApiClient;
import com.example.testandroid.data.ApiService;
import com.example.testandroid.model.TokenModel;
import com.example.testandroid.model.TokenResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiService apiService;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = ApiClient.getClient().create(ApiService.class);

        TokenModel body = new TokenModel("support@technopartner.id", "1234567");
        Call<TokenResponse> call = apiService.postAccessToken(body);
        call.enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                token = response.body().accessToken;
            }

            @Override
            public void onFailure(Call<TokenResponse> call, Throwable t) {

            }
        });
    }
    public void login(View view){
        Log.i("### LIANA", "access token: " + token);
        Intent intent= new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("AccessToken", token);
        startActivity(intent);
        finish();
    }
    public void signup(View view){
        Intent intent= new Intent(MainActivity.this, SignUpActivity.class);
        intent.putExtra("AccessToken", token);
        startActivity(intent);
        finish();
    }
}
