// navigation/Screen.kt
package com.sanchaarii.app.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Main : Screen("main")
    object Home : Screen("home")
    object TripPlanner : Screen("trip_planner")
    object Itinerary : Screen("itinerary")
    object ExpenseTracker : Screen("expense_tracker")
    object Profile : Screen("profile")
}