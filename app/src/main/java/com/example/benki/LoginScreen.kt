package com.example.benki

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(
    state: LoginState = LoginState(),
    actions: LoginActions = LoginActions()
) {
    // TODO UI Logic
}

@Composable
@Preview(name = "Login")
private fun LoginScreenPreview() {
    LoginScreen()
}

