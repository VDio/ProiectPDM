package com.example.dio.foodlab.common;

import com.example.dio.foodlab.services.ApiService;
import com.example.dio.foodlab.services.ApiServiceProvider;
import com.google.inject.AbstractModule;

import roboguice.inject.SharedPreferencesName;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiService.class).toProvider(ApiServiceProvider.class);
        bindConstant().annotatedWith(SharedPreferencesName.class).to("preferences");

        requestStaticInjection(Module.class);
    }
}