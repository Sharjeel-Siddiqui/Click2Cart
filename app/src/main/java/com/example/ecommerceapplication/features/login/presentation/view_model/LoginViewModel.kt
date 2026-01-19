package com.example.ecommerceapplication.features.login.presentation.view_model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onNameChanged(value: String) {
        _uiState.update {
            it.copy(
                name = value,
                nameError = if (value.length < 3) "Name must be at least 3 characters" else null
            )
        }
    }

    fun onPasswordChanged(value: String) {
        _uiState.update {
            it.copy(
                password = value,
                passwordError = if (value.length < 6) "Password must be at least 6 characters" else null
            )
        }
    }

    fun onLoginClick() {
        // API call or navigation
    }
}

data class LoginUiState(
    val name: String = "",
    val password: String = "",
    val nameError: String? = null,
    val passwordError: String? = null
)

