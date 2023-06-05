package com.example.modelapiclass;

import com.google.gson.annotations.SerializedName;

public class OriginLocation {

    public Integer id;

    @SerializedName("country_code")
    public String countryCode;

    @SerializedName("province_code")
    public String provinceCode;
    public String name;
    public String address1;

    public String address2;
    public String city;
    public String zip;
}
