package com.codingwithmitch.openapi.di.auth


import com.rekklesdroid.blogjetpackapp.api.auth.OpenApiAuthService
import com.rekklesdroid.blogjetpackapp.di.auth.AuthScope
import com.rekklesdroid.blogjetpackapp.persistence.AccountPropertiesDao
import com.rekklesdroid.blogjetpackapp.persistence.AuthTokenDao
import com.rekklesdroid.blogjetpackapp.repository.auth.AuthRepository
import com.rekklesdroid.blogjetpackapp.session.SessionManager
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthModule{

    // TEMPORARY
    @AuthScope
    @Provides
    fun provideFakeApiService(): OpenApiAuthService {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz")
            .build()
            .create(OpenApiAuthService::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        sessionManager: SessionManager,
        authTokenDao: AuthTokenDao,
        accountPropertiesDao: AccountPropertiesDao,
        openApiAuthService: OpenApiAuthService
        ): AuthRepository {
        return AuthRepository(
            authTokenDao,
            accountPropertiesDao,
            openApiAuthService,
            sessionManager
        )
    }

}