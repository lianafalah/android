package com.example.testandroid.model;

import com.google.gson.annotations.SerializedName;

public class HomeResponse {

    @SerializedName("token") public String token;
    @SerializedName("salam") public String salam;
    @SerializedName("beans") public String beans;
    @SerializedName("point") public String point;
    @SerializedName("balance") public String balance;
    @SerializedName("username") public String username;
    @SerializedName("primaryCard") public String primaryCard;
    @SerializedName("id_card") public String id_card;
    @SerializedName("card_number") public String card_number;
    @SerializedName("card_name") public String card_name;
    @SerializedName("card_image") public String card_image;
    @SerializedName("barcode") public String barcode;
    @SerializedName("distribution_id") public String distribution_id;
    @SerializedName("card_pin") public String card_pin;
    @SerializedName("expired_date") public String expired_date;
    @SerializedName("virtual_card") public String virtual_card;
    @SerializedName("email") public String email;
    @SerializedName("phone") public String phone;
    @SerializedName("referralCode") public String referralCode;
    @SerializedName("verifikasi_email") public String verifikasi_email;
    @SerializedName("verifikasi_sms") public String verifikasi_sms;
    @SerializedName("cardAmaount") public String cardAmount;

}
