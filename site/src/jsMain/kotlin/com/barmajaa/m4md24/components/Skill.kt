package com.barmajaa.m4md24.components

import androidx.compose.runtime.Composable
import com.barmajaa.m4md24.models.Skill
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Skill(skill : Skill) {
    Span({ classes("skill", "scale-in") }) {
        Text(skill.name)
    }
}