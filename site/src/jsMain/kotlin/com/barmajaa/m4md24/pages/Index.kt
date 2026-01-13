package com.barmajaa.m4md24.pages

import androidx.compose.runtime.*
import com.barmajaa.m4md24.components.DarkTheme
import com.barmajaa.m4md24.components.LightTheme
import com.barmajaa.m4md24.components.Link
import com.barmajaa.m4md24.components.Project
import com.barmajaa.m4md24.components.Skill
import com.barmajaa.m4md24.styles.AnimationStyles
import com.barmajaa.m4md24.styles.SimpleStyles
import com.barmajaa.m4md24.utilities.Constants
import com.barmajaa.m4md24.utilities.GetInitialTheme
import com.barmajaa.m4md24.utilities.SaveTheme
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.*

@Page
@Composable
fun Index() {
    var isDark by remember { mutableStateOf(GetInitialTheme()) }

    SaveTheme(isDark)

    Style(SimpleStyles)
    Style(if (isDark) DarkTheme else LightTheme)
    Style(AnimationStyles)

    Div({ classes("page") }) {
        Button({
            classes("theme-toggle")
            onClick { isDark = !isDark }
        }) {
            Text(if (isDark) "☀️" else "🌙")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                src = "MohamedSadawyThabet.png",
                description = "Mohamed Sadawy Thabet Logo",
                modifier = Modifier
                    .width(16.cssRem)
                    .height(16.cssRem)
                    .borderRadius(8.percent)
            )
        }

        Br()

        Header({ classes("header", "fade-in") }) {
            H1 { Text(Constants.Layouts.Index.NAME) }
            P { Text(Constants.Layouts.Index.JOB_TITLE) }
        }

        Section({ classes("section", "slide-in-right") }) {
            H2 { Text(Constants.Layouts.Index.ABOUT_ME_TITLE) }
            P { Text(Constants.Layouts.Index.ABOUT_ME) }
        }

        Section({ classes("section", "slide-in-left") }) {
            H2 { Text(Constants.Layouts.Index.SKILLS_TITLE) }
            Div({ classes("skills") }) {
                val allSkills = Constants.Skills.GetAll()
                allSkills.forEach {
                    Skill(it)
                }
            }
        }

        Section({ classes("section", "fade-in-up") }) {
            H2 { Text(Constants.Layouts.Index.PROJECTS_TITLE) }
            Div({ classes("projects") }) {
                /*val allProjects = Constants.Projects.GetAll()
                allProjects.forEach {
                    Project(it)
                }*/
            }
        }

        Footer({ classes("footer", "fade-in") }) {
            P {
                val allLinks = Constants.Links.GetAll()
                allLinks.forEachIndexed { index, link ->
                    Link(link)
                    if (index < allLinks.size - 1)
                        Text(" • ")
                }
            }
        }
    }
}