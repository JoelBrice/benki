package com.example.benki.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class LoginCoordinator(
    val viewModel: LoginViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {

    }
}

@Composable
fun rememberLoginCoordinator(
    viewModel: LoginViewModel = hiltViewModel()
): LoginCoordinator {
    return remember(viewModel) {
        LoginCoordinator(
            viewModel = viewModel
        )
    }
}