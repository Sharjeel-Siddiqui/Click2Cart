package com.example.ecommerceapplication.features.login.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ecommerceapplication.R
import com.example.ecommerceapplication.core.composables.AppOutlinedTextField
import com.example.ecommerceapplication.features.login.presentation.view_model.LoginViewModel


@Composable
@Preview(showBackground = true)
fun LoginScreen(
    viewModel: LoginViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {

            Text(
                text = "Login to your account",
                style = MaterialTheme.typography.headlineLarge,
            )

            Text(
                text = "It's great to see you again",
                style = MaterialTheme.typography.headlineSmall,
            )

            AppOutlinedTextField(
                value = state.name,
                onValueChange = viewModel::onNameChanged,
                label = "Name",
                isError = state.nameError != null,
                errorMessage = state.nameError
            )

            AppOutlinedTextField(
                value = state.password,
                onValueChange = viewModel::onPasswordChanged,
                label = "Password",
                keyboardType = KeyboardType.Password,
                visualTransformation = PasswordVisualTransformation(),
                isError = state.passwordError != null,
                errorMessage = state.passwordError
            )

            Text(
                text = "Forgot Password?",
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(10.dp)
                    .clickable {
                        // Navigate to forgot password
                    })
        }

        Button(
            onClick = viewModel::onLoginClick,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Text("Login")
        }
    }
}
