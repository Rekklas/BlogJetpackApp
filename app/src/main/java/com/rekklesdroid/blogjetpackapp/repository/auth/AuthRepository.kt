package com.rekklesdroid.blogjetpackapp.repository.auth

import com.rekklesdroid.blogjetpackapp.api.auth.OpenApiAuthService
import com.rekklesdroid.blogjetpackapp.persistence.AccountPropertiesDao
import com.rekklesdroid.blogjetpackapp.persistence.AuthTokenDao
import com.rekklesdroid.blogjetpackapp.session.SessionManager

/**
 * Created on 7/30/2020.
 */
class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
){
}