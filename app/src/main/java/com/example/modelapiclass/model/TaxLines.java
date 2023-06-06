package com.example.modelapiclass.model;

import com.google.gson.annotations.SerializedName;

public class TaxLines {

    @SerializedName("channel_liable")
    public Boolean channelLiable;

    public String price;

    @SerializedName("price_set")
    public Money priceSet;

    public Float rate;

    public String title;
}
