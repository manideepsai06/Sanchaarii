package com.sanchaarii.app.ui.screens.expense

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sanchaarii.app.ui.components.ComingSoonCard

@Composable
fun ExpenseTrackerScreen() {
    ExpenseTrackerScreenContent()
}

@Composable
fun ExpenseTrackerScreenContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        item {
            ComingSoonCard(
                title = "Expense Tracker",
                description = "Track your travel expenses, split bills with friends, and manage your budget with smart analytics.",
                icon = Icons.Default.Receipt,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExpenseTrackerScreen() {
    ExpenseTrackerScreenContent()
}
