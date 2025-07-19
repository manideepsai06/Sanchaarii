// navigation/BottomNavItem.kt
package com.sanchaarii.app.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

data class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val route: String // ✅ Just use String here
)

val bottomNavItems = listOf(
    BottomNavItem("Home", Icons.Default.Home, Screen.Home.route),
    BottomNavItem("Trip Planner", Icons.Default.TravelExplore, Screen.TripPlanner.route),
    BottomNavItem("Itinerary", Icons.Default.Schedule, Screen.Itinerary.route),
    BottomNavItem("Expenses", Icons.Default.Receipt, Screen.ExpenseTracker.route),
    BottomNavItem("Profile", Icons.Default.Person, Screen.Profile.route)
)