
package com.example.app.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.JsonObject;

import static com.example.app.myapplication.Status.ERROR;
import static com.example.app.myapplication.Status.LOADING;
import static com.example.app.myapplication.Status.SUCCESS;


public class JsonObjectResponse {
    public final Status status;

    @Nullable
    public final JsonObject data;

    @Nullable
    public final Throwable error;


    private JsonObjectResponse(Status status, @Nullable JsonObject data, @Nullable Throwable error) {

        this.status = status;
        this.data = data;
        this.error = error;
    }

    public static JsonObjectResponse loading() {
        return new JsonObjectResponse(LOADING, null, null);
    }

    public static JsonObjectResponse successSaveOrderModel(@NonNull JsonObject data) {
        return new JsonObjectResponse(SUCCESS, data, null);
    }

    public static JsonObjectResponse error(@NonNull Throwable error) {
        return new JsonObjectResponse(ERROR, null, error);
    }

}
