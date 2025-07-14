// ui/screens/trip/TripPlannerScreen.kt
package com.sanchaarii.app.ui.screens.trip

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.TravelExplore
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sanchaarii.app.ui.components.ComingSoonCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripPlannerScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        item {
            ComingSoonCard(
                title = "Trip Planner",
                description = "Plan your perfect journey with AI-powered recommendations, budget tracking, and collaborative planning tools.",
                icon = Icons.Default.TravelExplore,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
