package com.example.myapplication.ui.navigation

sealed class Routes(val route: String) {
    object Login : Routes("Login Screen")
    object Home : Routes("Home Screen")
    object ForgotPassword : Routes("ForgotPassword Screen")
}