// ui/screens/itinerary/ItineraryScreen.kt
package com.sanchaarii.app.ui.screens.itinerary

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sanchaarii.app.ui.components.ComingSoonCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItineraryScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        item {
            ComingSoonCard(
                title = "Itinerary Manager",
                description = "Organize your daily plans, manage bookings, and get real-time updates on your travel schedule.",
                icon = Icons.Default.Schedule,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}