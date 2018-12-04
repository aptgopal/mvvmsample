package com.example.app.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.util.Log;

import com.example.app.myapplication.di.component.ApplicationComponent;
import com.example.app.myapplication.di.component.DaggerApplicationComponent;
import com.example.app.myapplication.di.modules.ContextModule;
import com.example.app.myapplication.network.ApiService;
import com.squareup.picasso.Picasso;


import java.util.HashMap;
import java.util.Map;

import javax.xml.validation.Validator;

import timber.log.Timber;



public class App extends Application {

    public boolean isApplicationBackGround;
    private static Context mApplicationContext;
     private ApplicationComponent component;
    public static Activity appactivity;
   public static App get(Activity activity){
       return (App) activity.getApplication();
   }

   private ApiService apiService;
//    private ApiTicketService apiTicketService;
   private Picasso picasso;
   private SharedPreferences sharedPreferences ;
   private Validator validator ;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = getApplicationContext();


//        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/OpenSans-Regular.ttf");
        component = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
        apiService = component.getApiService();
//        picasso = component.getPicasso();
//        sharedPreferences = component.getSharedPreferences();
//        validator = component.getValidator();


    }
    public ApplicationComponent getComponent() {
        return component;
    }

    public static Context getAppContext() {
        return mApplicationContext;
    }









}
