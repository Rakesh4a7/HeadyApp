package com.example.headyapp.api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Rakesh
 */
@Module
public class MockApiModule
{

    @Provides
    @Singleton
    ApiService providesApiService()
    {
        return new MockApiService();
    }
}
