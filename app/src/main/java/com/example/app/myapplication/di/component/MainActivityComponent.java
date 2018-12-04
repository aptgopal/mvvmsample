package com.example.app.myapplication.di.component;

import com.example.app.myapplication.MainActivity;
import com.example.app.myapplication.di.modules.MainActivityModule;
import com.example.app.myapplication.di.scope.MainActivityScope;

import dagger.Component;

@MainActivityScope
@Component(modules = {MainActivityModule.class},
        dependencies = {ApplicationComponent.class})
public interface MainActivityComponent {
    void injectMainActivity(MainActivity loginActivity);

}
