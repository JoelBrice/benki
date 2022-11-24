package com.example.benki

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember


@Composable
fun LoginRoute(
    coordinator: LoginCoordinator = rememberLoginCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(initial = LoginState())

    // UI Actions
    val actions = rememberLoginActions(coordinator)

    // UI Rendering
    LoginScreen(uiState, actions)
}


@Composable
fun rememberLoginActions(coordinator: LoginCoordinator): LoginActions {
    return remember(coordinator) {
        LoginActions(
            onClick = coordinator::doStuff
        )
    }
}