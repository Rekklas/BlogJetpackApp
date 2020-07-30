package com.rekklesdroid.blogjetpackapp.di

import androidx.lifecycle.ViewModelProvider
import com.rekklesdroid.blogjetpackapp.viewmodel.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}