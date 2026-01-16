package com.example.ecommerceapplication.core


sealed class Screens(val route: String) {
    object Login : Screens("login")
    object SignUp : Screens("signup")
    object Home : Screens("home")
    object Cart : Screens("cart")
    object Profile : Screens("profile")
}