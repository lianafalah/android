package com.example.testandroid.data;

import com.example.testandroid.model.HomeModel;
import com.example.testandroid.model.HomeResponse;
import com.example.testandroid.model.Login;
import com.example.testandroid.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {


    @POST("login")
    Call<LoginResponse> postLoginData(@Body Login Body,
                                      @Header("Authorization") String authorization);


    /*
    @POST("login")
    Call<LoginResponse> postLoginData(@Body Login Body,
                                      @Header("Authorization") String authorization);


                                      */

    @POST("v2/home")
    Call<HomeResponse> postHome(@Body HomeModel Body, @Header("Authorization") String authorization);
}
