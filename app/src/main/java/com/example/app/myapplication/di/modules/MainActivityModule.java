package com.example.app.myapplication.di.modules;

import com.example.app.myapplication.MainActivity;
import com.example.app.myapplication.di.scope.MainActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
   private final MainActivity mMainActivity;

    public MainActivityModule(MainActivity mMainActivity) {
        this.mMainActivity = mMainActivity;

    }

    @Provides
    @MainActivityScope
    public MainActivity loginActivity() {
        return mMainActivity;
    }




}
