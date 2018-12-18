package com.example.testandroid;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    public void signUp(View view){
        Intent intent= new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
    public void logins(View view) {
        EditText email = findViewById(R.id.EmailEt);
        EditText password = findViewById(R.id.passwordED);
        Call<LoginResponse> call = apiService.postLoginData(email.getText().toString(), password.getText().toString(), "Bearer EbxWTaZzRglQfyjvBYoldy5FfiKW2vSNjrybnSqo");
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()) {
                    Log.i("### token", "onResponse login: " + response.body().token);
                    Log.i("### username", "onResponse login: " + response.body().username);
                    Log.i("### foto", "onResponse login: " + response.body().foto);
                    Log.i("### status", "onResponse login: " + response.body().status);
                    Log.i("### mobilePhoneUser", "onResponse login: " + response.body().mobilePhoneUser);
                    Intent home= new Intent(LoginActivity.this, HomeAppActivity.class);
                    startActivity(home);
                } else {

                }
            }
            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.i("### ERROR", "onFailure: " + t.getMessage());
            }
        });
    }
}
