// utils/PreferencesManager.kt
package com.sanchaarii.app.utils

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesManager @Inject constructor(
    private val dataStore: DataStore<Preferences>
) {
    private object PreferencesKeys {
        val DARK_THEME = booleanPreferencesKey("dark_theme")
    }

    val isDarkTheme: Flow<Boolean> = dataStore.data.map { preferences ->
        preferences[PreferencesKeys.DARK_THEME] ?: false
    }

    suspend fun setDarkTheme(isDarkTheme: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKeys.DARK_THEME] = isDarkTheme
        }
    }
}