// navigation/SanchaariiNavigation.kt
package com.sanchaarii.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sanchaarii.app.ui.screens.auth.LoginScreen
import com.sanchaarii.app.ui.screens.auth.SignUpScreen
import com.sanchaarii.app.ui.screens.expense.ExpenseTrackerScreen
import com.sanchaarii.app.ui.screens.home.HomeScreen
import com.sanchaarii.app.ui.screens.itinerary.ItineraryScreen
import com.sanchaarii.app.ui.screens.main.MainScreen
import com.sanchaarii.app.ui.screens.profile.ProfileScreen
import com.sanchaarii.app.ui.screens.splash.SplashScreen
import com.sanchaarii.app.ui.screens.trip.TripPlannerScreen
import com.sanchaarii.app.viewmodel.ThemeViewModel

@Preview
@Composable
fun SanchaariiNavigation(
    navController: NavHostController,
    themeViewModel: ThemeViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }

        composable(Screen.Main.route) {
            MainScreen(themeViewModel = themeViewModel)
        }

        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.TripPlanner.route) {
            TripPlannerScreen()
        }

        composable(Screen.Itinerary.route) {
            ItineraryScreen()
        }

        composable(Screen.ExpenseTracker.route) {
            ExpenseTrackerScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen(themeViewModel = themeViewModel)
        }
    }
}