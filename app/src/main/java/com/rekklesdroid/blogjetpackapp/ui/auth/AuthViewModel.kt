package com.rekklesdroid.blogjetpackapp.ui.auth

import androidx.lifecycle.ViewModel
import com.rekklesdroid.blogjetpackapp.repository.auth.AuthRepository
import javax.inject.Inject

/**
 * Created on 7/30/2020.
 */
class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel() {
}