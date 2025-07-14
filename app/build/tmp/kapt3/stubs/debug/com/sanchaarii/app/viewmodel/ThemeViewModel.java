package com.sanchaarii.app.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/sanchaarii/app/viewmodel/ThemeViewModel;", "Landroidx/lifecycle/ViewModel;", "preferencesManager", "Lcom/sanchaarii/app/utils/PreferencesManager;", "(Lcom/sanchaarii/app/utils/PreferencesManager;)V", "_isDarkTheme", "Landroidx/compose/runtime/MutableState;", "", "isDarkTheme", "Landroidx/compose/runtime/State;", "()Landroidx/compose/runtime/State;", "loadThemePreference", "", "toggleTheme", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ThemeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.sanchaarii.app.utils.PreferencesManager preferencesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _isDarkTheme = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.Boolean> isDarkTheme = null;
    
    @javax.inject.Inject()
    public ThemeViewModel(@org.jetbrains.annotations.NotNull()
    com.sanchaarii.app.utils.PreferencesManager preferencesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.Boolean> isDarkTheme() {
        return null;
    }
    
    private final void loadThemePreference() {
    }
    
    public final void toggleTheme() {
    }
}