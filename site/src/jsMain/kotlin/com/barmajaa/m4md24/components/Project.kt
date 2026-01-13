package com.barmajaa.m4md24.components

import androidx.compose.runtime.Composable
import com.barmajaa.m4md24.models.Project
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.gap
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Project(
    project: Project
) {
    Div({ classes("project", "slide-in-up") }) {
        H3 { Text(project.name) }
        P({ classes("project-description") }) { Text(project.description) }
        project.whatDidIDo.forEach { achievement ->
            P({ classes("project-achievements") }) { Text(achievement) }
        }
        Br()
        P({ classes("project-technologies") }) {
            project.technologies.forEachIndexed { index, technology ->
                Text(technology)
                if (index < project.technologies.size - 1)
                    Span({ classes("project-technologies-separator") }) { Text(" | ") }
            }
        }
        Br()
        Hr()
        Br()
        Div({
            style {
                display(DisplayStyle.Flex)
                gap(15.px)
                property("flex-wrap", "wrap")
            }
        }) {
            A(href = project.designLink, attrs = {
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
                classes("project-link-button")
            }) {
                Text("تصميم التطبيق")
            }
            A(href = project.codeLink, attrs = {
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
                classes("project-link-button")
            }) {
                Text("أكواد التطبيق")
            }
        }
    }
}