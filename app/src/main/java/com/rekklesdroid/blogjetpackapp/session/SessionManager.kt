package com.rekklesdroid.blogjetpackapp.session

import android.app.Application
import com.rekklesdroid.blogjetpackapp.persistence.AuthTokenDao
import javax.inject.Inject

/**
 * Created on 7/30/2020.
 */
class SessionManager
@Inject
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
) {
}