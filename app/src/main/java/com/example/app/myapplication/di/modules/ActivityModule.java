package com.example.app.myapplication.di.modules;

import android.app.Activity;
import android.content.Context;

import com.example.app.myapplication.di.scope.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Activity context;

    public ActivityModule(Activity context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @Named("activity_context")
    public Context context() {
        return context;
    }
}