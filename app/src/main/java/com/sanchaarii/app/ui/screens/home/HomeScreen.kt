package com.sanchaarii.app.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sanchaarii.app.ui.components.SectionTitle
import com.sanchaarii.app.ui.components.StatsCard
import com.sanchaarii.app.viewmodel.HomeViewModel
import com.sanchaarii.app.viewmodel.HomeState

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val homeState by viewModel.homeState.collectAsState()
    HomeScreenContent(homeState)
}

@Composable
fun HomeScreenContent(homeState: HomeState) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Welcome Section
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Welcome back,",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Text(
                        text = homeState.userName,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Ready for your next adventure?",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f)
                    )
                }
            }
        }

        item {
            // Stats Row
            SectionTitle(title = "Quick Stats")

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    StatsCard(
                        title = "Upcoming Trips",
                        value = homeState.upcomingTrips.toString(),
                        icon = Icons.Default.Flight,
                        modifier = Modifier.width(120.dp)
                    )
                }

                item {
                    StatsCard(
                        title = "Total Expenses",
                        value = "${homeState.totalExpenses.toInt()}",
                        icon = Icons.Default.AccountBalance,
                        modifier = Modifier.width(120.dp)
                    )
                }

                item {
                    StatsCard(
                        title = "Countries",
                        value = "12",
                        icon = Icons.Default.Public,
                        modifier = Modifier.width(120.dp)
                    )
                }
            }
        }

        item {
            // Quick Actions
            SectionTitle(title = "Quick Actions")

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    QuickActionCard(
                        title = "Plan Trip",
                        icon = Icons.Default.AddLocation,
                        onClick = { /* TODO: Navigate to trip planner */ }
                    )
                }

                item {
                    QuickActionCard(
                        title = "Add Expense",
                        icon = Icons.Default.Add,
                        onClick = { /* TODO: Navigate to expense tracker */ }
                    )
                }

                item {
                    QuickActionCard(
                        title = "View Itinerary",
                        icon = Icons.Default.Schedule,
                        onClick = { /* TODO: Navigate to itinerary */ }
                    )
                }
            }
        }

        item {
            // Recent Activities
            SectionTitle(title = "Recent Activities")

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    homeState.recentActivities.forEach { activity ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(16.dp)
                            )

                            Spacer(modifier = Modifier.width(12.dp))

                            Text(
                                text = activity,
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun QuickActionCard(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.size(100.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreenContent(
        homeState = HomeState(
            userName = "John Doe",
            upcomingTrips = 2,
            totalExpenses = 1250.0,
            recentActivities = listOf(
                "Added trip to Bali",
                "Shared itinerary",
                "Updated expense record"
            )
        )
    )
}
