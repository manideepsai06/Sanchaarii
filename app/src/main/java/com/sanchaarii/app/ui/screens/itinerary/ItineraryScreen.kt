package com.sanchaarii.app.ui.screens.itinerary

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sanchaarii.app.ui.components.ComingSoonCard

@Composable
fun ItineraryScreen() {
    ItineraryScreenContent()
}

@Composable
fun ItineraryScreenContent() {
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

@Preview(showBackground = true)
@Composable
fun PreviewItineraryScreen() {
    ItineraryScreenContent()
}
