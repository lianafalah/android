package com.example.testandroid.model;

public class TokenModel {
    private String client_secret = "0a40f69db4e5fd2f4ac65a090f31b823";
    private String client_id = "e78869f77986684a";
    private String grant_type = "password";
    private String username;
    private String password;

    public TokenModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}