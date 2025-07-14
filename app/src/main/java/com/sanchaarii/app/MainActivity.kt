// MainActivity.kt content
package com.sanchaarii.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.sanchaarii.app.navigation.SanchaariiNavigation
import com.sanchaarii.app.theme.SanchaariiTheme
import com.sanchaarii.app.viewmodel.ThemeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SanchaariiApp()
        }
    }
}

@Preview
@Composable
fun SanchaariiApp() {
    val themeViewModel: ThemeViewModel = hiltViewModel()
    val navController = rememberNavController()

    SanchaariiTheme(
        darkTheme = themeViewModel.isDarkTheme.value
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SanchaariiNavigation(
                navController = navController,
                themeViewModel = themeViewModel
            )
        }
    }
}