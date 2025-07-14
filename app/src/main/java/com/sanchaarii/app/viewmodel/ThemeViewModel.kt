// viewmodel/ThemeViewModel.kt
package com.sanchaarii.app.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sanchaarii.app.utils.PreferencesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ThemeViewModel @Inject constructor(
    private val preferencesManager: PreferencesManager
) : ViewModel() {

    private val _isDarkTheme = mutableStateOf(false)
    val isDarkTheme: State<Boolean> = _isDarkTheme

    init {
        loadThemePreference()
    }

    private fun loadThemePreference() {
        viewModelScope.launch {
            _isDarkTheme.value = preferencesManager.isDarkTheme.first()
        }
    }

    fun toggleTheme() {
        viewModelScope.launch {
            val newTheme = !_isDarkTheme.value
            _isDarkTheme.value = newTheme
            preferencesManager.setDarkTheme(newTheme)
        }
    }
}