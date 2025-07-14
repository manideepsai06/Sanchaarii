package com.sanchaarii.app.utils;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/sanchaarii/app/utils/PreferencesManager;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "isDarkTheme", "Lkotlinx/coroutines/flow/Flow;", "", "()Lkotlinx/coroutines/flow/Flow;", "setDarkTheme", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferencesKeys", "app_debug"})
public final class PreferencesManager {
    @org.jetbrains.annotations.NotNull()
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isDarkTheme = null;
    
    @javax.inject.Inject()
    public PreferencesManager(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isDarkTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setDarkTheme(boolean isDarkTheme, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/sanchaarii/app/utils/PreferencesManager$PreferencesKeys;", "", "()V", "DARK_THEME", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getDARK_THEME", "()Landroidx/datastore/preferences/core/Preferences$Key;", "app_debug"})
    static final class PreferencesKeys {
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> DARK_THEME = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.sanchaarii.app.utils.PreferencesManager.PreferencesKeys INSTANCE = null;
        
        private PreferencesKeys() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getDARK_THEME() {
            return null;
        }
    }
}