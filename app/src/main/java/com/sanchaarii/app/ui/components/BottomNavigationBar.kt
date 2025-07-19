// ui/components/BottomNavigationBar.kt
package com.sanchaarii.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sanchaarii.app.navigation.BottomNavItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar(tonalElevation = 8.dp) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = selectedItem == index,
                onClick = { onItemSelected(index) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    val previewItems = listOf(
        BottomNavItem("Home", Icons.Default.Home, "home"),
        BottomNavItem("Trip Planner", Icons.Default.TravelExplore, "trip_planner"),
        BottomNavItem("Itinerary", Icons.Default.Schedule, "itinerary"),
        BottomNavItem("Expenses", Icons.Default.Receipt, "expense_tracker"),
        BottomNavItem("Profile", Icons.Default.Person, "profile")
    )

    BottomNavigationBar(
        items = previewItems,
        selectedItem = 0,
        onItemSelected = {}
    )
}
