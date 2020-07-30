package com.rekklesdroid.blogjetpackapp

import com.rekklesdroid.blogjetpackapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


/**
 * Created on 7/30/2020.
 */
class BaseApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}