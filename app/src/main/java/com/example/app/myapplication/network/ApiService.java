package com.example.app.myapplication.network;


import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;

import io.reactivex.Maybe;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiService {


    @POST("WinterWonderlandWeb/signUp")
    Maybe<JsonObject> registerUser(@HeaderMap Map<String, String> headerMap, @Body JsonObject params);



}
