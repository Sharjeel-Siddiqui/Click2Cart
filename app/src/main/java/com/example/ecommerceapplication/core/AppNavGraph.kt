package com.example.ecommerceapplication.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun AppNavGraph(
    navController: NavHostController,
    startDestination: String = Screens.Login.route,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screens.Login.route) {

        }
    }

}