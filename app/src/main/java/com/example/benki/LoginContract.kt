package com.example.benki

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


/**
 * UI State that represents LoginScreen
 **/
class LoginState

/**
 * Login Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class LoginActions(
    val onClick: () -> Unit = {}
)

/**
 * Compose Utility to retrieve actions from nested components
 **/
val LocalLoginActions = staticCompositionLocalOf<LoginActions> {
    error("{NAME} Actions Were not provided, make sure ProvideLoginActions is called")
}

@Composable
fun ProvideLoginActions(actions: LoginActions, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalLoginActions provides actions) {
        content.invoke()
    }
}

