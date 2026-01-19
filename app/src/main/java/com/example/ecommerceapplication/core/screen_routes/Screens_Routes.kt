package com.example.ecommerceapplication.core.screen_routes

sealed class ScreensRoutes(val route: String) {
    object Splash : ScreensRoutes("splash")
    object Login : ScreensRoutes("login")
    object SignUp : ScreensRoutes("signup")
    object Home : ScreensRoutes("home")
    object Cart : ScreensRoutes("cart")
    object Profile : ScreensRoutes("profile")
}