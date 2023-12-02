package com.example.android.hilt.navigator

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppNavigatorModule {

    @Binds
    abstract fun bindAppNavigator(appNavigator: AppNavigatorImpl): AppNavigator
}