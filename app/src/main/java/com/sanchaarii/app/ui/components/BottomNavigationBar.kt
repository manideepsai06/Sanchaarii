// ui/components/BottomNavigationBar.kt
package com.sanchaarii.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.sanchaarii.app.navigation.BottomNavItem

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar {
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