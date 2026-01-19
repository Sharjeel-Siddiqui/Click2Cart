package com.example.ecommerceapplication.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ecommerceapplication.core.screen_routes.ScreensRoutes
import com.example.ecommerceapplication.features.login.presentation.screen.LoginScreen
import com.example.ecommerceapplication.features.splash.presentation.SplashScreen


@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier,
    startDestination: String = ScreensRoutes.Splash.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ScreensRoutes.Splash.route) {
            //   SplashScreen()
            LoginScreen()
        }

        composable(ScreensRoutes.Login.route) {

        }

        composable(ScreensRoutes.SignUp.route) {

        }

        composable(ScreensRoutes.Home.route) {

        }

        composable(ScreensRoutes.Cart.route) {

        }

        composable(ScreensRoutes.Profile.route) {

        }
    }

}