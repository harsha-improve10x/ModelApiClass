package com.example.modelapiclass.model;

import com.google.gson.annotations.SerializedName;

public class Money {

    @SerializedName("shop_money")
    public ShopMoney shopMoney;

    @SerializedName("presentment_money")
    public PresentmentMoney presentmentMoney;
}
