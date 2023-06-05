package com.example.modelapiclass;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.modelapiclass.network.ModelApi;
import com.example.modelapiclass.network.ModelApiService;

public class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setUpApiService();
    }

    private void setUpApiService() {
        ModelApi modelApi = new ModelApi();
        ModelApiService modelApiService = modelApi.createModelApiService();
    }
}
