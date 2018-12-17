package com.example.testandroid.data;

import com.example.testandroid.model.Login;
import com.example.testandroid.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {

    @POST("login")
    Call<LoginResponse> postLoginData(@Body Login Body,
                                      @Header("Authorization") String authorization);
}
