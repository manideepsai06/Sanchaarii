// viewmodel/AuthViewModel.kt
package com.sanchaarii.app.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class AuthState(
    val isLoading: Boolean = false,
    val isLoggedIn: Boolean = false,
    val error: String? = null
)

@HiltViewModel
class AuthViewModel @Inject constructor() : ViewModel() {

    private val _authState = MutableStateFlow(AuthState())
    val authState: StateFlow<AuthState> = _authState.asStateFlow()

    fun login(email: String, password: String) {
        // Placeholder for login logic
        _authState.value = _authState.value.copy(isLoading = true)
        // Simulate login success
        _authState.value = _authState.value.copy(isLoading = false, isLoggedIn = true)
    }

    fun signUp(email: String, password: String, confirmPassword: String) {
        // Placeholder for signup logic
        _authState.value = _authState.value.copy(isLoading = true)
        // Simulate signup success
        _authState.value = _authState.value.copy(isLoading = false, isLoggedIn = true)
    }
}