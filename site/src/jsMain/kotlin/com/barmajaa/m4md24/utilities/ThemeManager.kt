package com.barmajaa.m4md24.utilities

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.browser.localStorage
import kotlinx.browser.window

fun GetSystemThemePreference() = window.matchMedia("(prefers-color-scheme: dark)").matches

fun GetInitialTheme() : Boolean {
    val saved = localStorage.getItem("theme")
    return if (saved != null)
        saved == "dark"
    else
        GetSystemThemePreference()
}
@Composable
fun SaveTheme(isDark : Boolean) = LaunchedEffect(isDark) {
    localStorage.setItem("theme", if (isDark) "dark" else "light")
}