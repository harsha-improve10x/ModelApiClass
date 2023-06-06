package com.example.modelapiclass;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.modelapiclass.model.Shop;
import com.example.modelapiclass.network.ModelApi;
import com.example.modelapiclass.network.ModelApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fetchDetails() throws IOException {
        ModelApiService modelApiService = new ModelApi().createModelApiService();
        Call<List<Shop>> call = modelApiService.fetchDetails();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
        assertEquals("1.23", shops.get(0).lineItems.get(0).taxLines.get(1).price);
    }
}