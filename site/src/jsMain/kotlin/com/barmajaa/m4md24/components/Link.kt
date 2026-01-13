package com.barmajaa.m4md24.components

import androidx.compose.runtime.Composable
import com.barmajaa.m4md24.models.Link
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text

@Composable
fun Link(link : Link) {
    A(link.link, { classes("link") }) {
        Text("${link.emoji} ${link.title}")
    }
}