package com.example.app.myapplication.di.component;

import android.content.SharedPreferences;

import com.example.app.myapplication.MainActivity;
import com.example.app.myapplication.di.modules.ActivityModule;
import com.example.app.myapplication.di.modules.ApiServiceModule;
import com.example.app.myapplication.di.modules.PicassoModule;
import com.example.app.myapplication.di.scope.ApplicationScope;
import com.example.app.myapplication.network.ApiService;
import com.squareup.picasso.Picasso;

import javax.xml.validation.Validator;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApiServiceModule.class,  ActivityModule.class})
public interface ApplicationComponent {
    ApiService getApiService();
    void inject(MainActivity loginActivity);

}
