package com.rekklesdroid.blogjetpackapp.di.auth

import com.rekklesdroid.blogjetpackapp.ui.auth.ForgotPasswordFragment
import com.rekklesdroid.blogjetpackapp.ui.auth.LauncherFragment
import com.rekklesdroid.blogjetpackapp.ui.auth.LoginFragment
import com.rekklesdroid.blogjetpackapp.ui.auth.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLauncherFragment(): LauncherFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): RegisterFragment

    @ContributesAndroidInjector()
    abstract fun contributeForgotPasswordFragment(): ForgotPasswordFragment

}