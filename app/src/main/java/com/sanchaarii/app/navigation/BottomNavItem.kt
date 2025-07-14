// navigation/BottomNavItem.kt
package com.sanchaarii.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
)

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        icon = Icons.Default.Home,
        screen = Screen.Home
    ),
    BottomNavItem(
        title = "Trip Planner",
        icon = Icons.Default.TravelExplore,
        screen = Screen.TripPlanner
    ),
    BottomNavItem(
        title = "Itinerary",
        icon = Icons.Default.Schedule,
        screen = Screen.Itinerary
    ),
    BottomNavItem(
        title = "Expenses",
        icon = Icons.Default.Receipt,
        screen = Screen.ExpenseTracker
    ),
    BottomNavItem(
        title = "Profile",
        icon = Icons.Default.Person,
        screen = Screen.Profile
    )
)
