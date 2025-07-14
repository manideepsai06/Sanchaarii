// viewmodel/HomeViewModel.kt
package com.sanchaarii.app.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class HomeState(
    val userName: String = "Travel Explorer",
    val upcomingTrips: Int = 3,
    val totalExpenses: Double = 2450.0,
    val recentActivities: List<String> = listOf(
        "Added new trip to Bali",
        "Updated expense for Paris trip",
        "Shared itinerary with group"
    )
)

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _homeState = MutableStateFlow(HomeState())
    val homeState: StateFlow<HomeState> = _homeState.asStateFlow()
}
