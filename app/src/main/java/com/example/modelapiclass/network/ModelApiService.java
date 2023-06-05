package com.example.modelapiclass.network;

import com.example.modelapiclass.ClientDetails;
import com.example.modelapiclass.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ModelApiService {

    @GET("api/479dd07f8c1d482e9219f7dcb48e25f4/renukaTemplates")
    Call<List<Shop>> fetchDetails();

}
