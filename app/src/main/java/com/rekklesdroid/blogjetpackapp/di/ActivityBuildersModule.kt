package com.rekklesdroid.blogjetpackapp.di

import com.codingwithmitch.openapi.di.auth.AuthModule
import com.rekklesdroid.blogjetpackapp.di.auth.AuthFragmentBuildersModule
import com.rekklesdroid.blogjetpackapp.di.auth.AuthScope
import com.rekklesdroid.blogjetpackapp.di.auth.AuthViewModelModule
import com.rekklesdroid.blogjetpackapp.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}