// ui/screens/main/MainScreen.kt
package com.sanchaarii.app.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sanchaarii.app.navigation.BottomNavItem
import com.sanchaarii.app.navigation.Screen
import com.sanchaarii.app.navigation.bottomNavItems
import com.sanchaarii.app.ui.components.BottomNavigationBar
import com.sanchaarii.app.ui.screens.expense.ExpenseTrackerScreen
import com.sanchaarii.app.ui.screens.home.HomeScreen
import com.sanchaarii.app.ui.screens.itinerary.ItineraryScreen
import com.sanchaarii.app.ui.screens.profile.ProfileScreen
import com.sanchaarii.app.ui.screens.trip.TripPlannerScreen
import com.sanchaarii.app.viewmodel.ThemeViewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(themeViewModel: ThemeViewModel) {
    val navController = rememberNavController()
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavItems,
                selectedItem = selectedItem,
                onItemSelected = { index ->
                    selectedItem = index
                    navController.navigate(bottomNavItems[index].route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {
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
}
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem("Home", Icons.Default.Home, "home"),
                    BottomNavItem("Trips", Icons.Default.TravelExplore, "trip_planner"),
                    BottomNavItem("Itinerary", Icons.Default.Schedule, "itinerary"),
                    BottomNavItem("Expenses", Icons.Default.Receipt, "expenses"),
                    BottomNavItem("Profile", Icons.Default.Person, "profile")
                ),
                selectedItem = 0,
                onItemSelected = {}
            )
        }
    ) { padding ->
        HomeScreen() //
    }
}