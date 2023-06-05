package com.example.modelapiclass;

import com.google.gson.annotations.SerializedName;

public class PresentmentMoney {

    public String amount;

    @SerializedName("currency_code")
    public String currencyCode;
}
