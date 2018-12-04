package com.example.app.myapplication.di.modules;

import android.content.Context;

import com.example.app.myapplication.ApplicationContext;
import com.example.app.myapplication.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }

}
