package com.barmajaa.m4md24.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Home() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.black),
        contentAlignment = Alignment.Center
    ) {
        Span(
            {
                style {
                    color(Color.white)
                    fontWeight("bold")
                }
            }
        ) {
            Text("Hello @m4md24")
        }
    }
}