// ui/screens/profile/ProfileScreen.kt
package com.sanchaarii.app.ui.screens.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sanchaarii.app.viewmodel.ThemeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    themeViewModel: ThemeViewModel
) {
    val isDarkTheme by themeViewModel.isDarkTheme

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Profile Header
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
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Surface(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape),
                        color = MaterialTheme.colorScheme.primary
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            tint = MaterialTheme.colorScheme.onPrimary,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Travel Explorer",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )

                    Text(
                        text = "travel.explorer@example.com",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                    )
                }
            }
        }

        item {
            // Settings Section
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Settings",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    // Theme Toggle
                    SettingsItem(
                        icon = if (isDarkTheme) Icons.Default.DarkMode else Icons.Default.LightMode,
                        title = "Dark Theme",
                        subtitle = "Switch between light and dark mode",
                        trailing = {
                            Switch(
                                checked = isDarkTheme,
                                onCheckedChange = { themeViewModel.toggleTheme() }
                            )
                        }
                    )

                    Divider()

                    SettingsItem(
                        icon = Icons.Default.Notifications,
                        title = "Notifications",
                        subtitle = "Manage your notification preferences",
                        onClick = { /* TODO: Navigate to notifications */ }
                    )

                    Divider()

                    SettingsItem(
                        icon = Icons.Default.Language,
                        title = "Language",
                        subtitle = "Choose your preferred language",
                        onClick = { /* TODO: Navigate to language settings */ }
                    )

                    Divider()

                    SettingsItem(
                        icon = Icons.Default.Security,
                        title = "Privacy & Security",
                        subtitle = "Manage your privacy settings",
                        onClick = { /* TODO: Navigate to privacy settings */ }
                    )
                }
            }
        }

        item {
            // Additional Options
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Support",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    SettingsItem(
                        icon = Icons.Default.Help,
                        title = "Help & Support",
                        subtitle = "Get help with using the app",
                        onClick = { /* TODO: Navigate to help */ }
                    )

                    Divider()

                    SettingsItem(
                        icon = Icons.Default.Info,
                        title = "About",
                        subtitle = "App version and information",
                        onClick = { /* TODO: Navigate to about */ }
                    )

                    Divider()

                    SettingsItem(
                        icon = Icons.Default.Logout,
                        title = "Sign Out",
                        subtitle = "Sign out of your account",
                        onClick = { /* TODO: Implement sign out */ }
                    )
                }
            }
        }
    }
}

@Composable
fun SettingsItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String,
    onClick: (() -> Unit)? = null,
    trailing: @Composable (() -> Unit)? = null
) {
    val modifier = if (onClick != null) {
        Modifier.fillMaxWidth()
    } else {
        Modifier.fillMaxWidth()
    }

    Surface(
        modifier = modifier,
        onClick = onClick ?: {}
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Text(
                    text = subtitle,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            if (trailing != null) {
                trailing()
            } else if (onClick != null) {
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "Navigate",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}