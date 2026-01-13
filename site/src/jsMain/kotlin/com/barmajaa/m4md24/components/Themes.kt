package com.barmajaa.m4md24.components

import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rgb

object LightTheme : StyleSheet() {
    init {
        "html" style {
            property("background-color", "rgb(250, 250, 250) !important")
        }

        "body" style {
            property("background-color", "rgb(250, 250, 250) !important")
            property("color", "rgb(30, 30, 30) !important")
        }

        "hr" style {
            property("border-top", "0.2rem solid rgb(220, 38, 38)")
        }

        ".theme-toggle" style {
            backgroundColor(rgb(255, 255, 255))
            color(rgb(30, 30, 30))
        }

        ".header" style {
            backgroundColor(rgb(220, 38, 38))
            color(rgb(255, 255, 255))
        }

        ".section" style {
            backgroundColor(rgb(255, 255, 255))
        }

        ".section h2" style {
            color(rgb(220, 38, 38))
            property("border-color", "rgb(220, 38, 38)")
        }

        ".section p" style {
            color(rgb(60, 60, 60))
        }

        ".skill" style {
            backgroundColor(rgb(254, 242, 242))
            color(rgb(220, 38, 38))
        }

        ".project" style {
            backgroundColor(rgb(255, 255, 255))
            border(2.px, LineStyle.Solid, rgb(240, 240, 240))
        }

        ".project h3" style {
            color(rgb(220, 38, 38))
        }

        ".project-description" style {
            color(rgb(60, 60, 60))
        }

        ".project-achievements" style {}

        ".project-achievements::before" style {
            color(rgb(220, 38, 38))
        }

        ".project-technologies" style {
            color(rgb(100, 100, 100))
        }

        ".project-technologies-separator" style {
            color(rgb(220, 38, 38))
        }

        ".project-link-button" style {
            backgroundColor(rgb(220, 38, 38))
            color(rgb(255, 255, 255))
        }

        ".footer" style {
            backgroundColor(rgb(255, 255, 255))
            border(2.px, LineStyle.Solid, rgb(240, 240, 240))
        }

        ".footer p" style {
            color(rgb(60, 60, 60))
        }

        ".link" style {
            color(rgb(220, 38, 38))
            backgroundColor(rgb(254, 242, 242))
        }
    }
}

object DarkTheme : StyleSheet() {
    init {
        "html" style {
            property("background-color", "rgb(20, 20, 20) !important")
        }

        "body" style {
            property("background-color", "rgb(20, 20, 20) !important")
            property("color", "rgb(230, 230, 230) !important")
        }

        "hr" style {
            property("border-top", "0.2rem solid rgb(185, 28, 28)")
        }

        ".theme-toggle" style {
            backgroundColor(rgb(40, 40, 40))
            color(rgb(255, 215, 0))
        }

        ".header" style {
            backgroundColor(rgb(185, 28, 28))
            color(rgb(255, 255, 255))
        }

        ".section" style {
            backgroundColor(rgb(30, 30, 30))
        }

        ".section h2" style {
            color(rgb(239, 68, 68))
            property("border-color", "rgb(239, 68, 68)")
        }

        ".section p" style {
            color(rgb(200, 200, 200))
        }

        ".skill" style {
            backgroundColor(rgb(60, 20, 20))
            color(rgb(252, 165, 165))
        }

        ".project" style {
            backgroundColor(rgb(35, 35, 35))
            border(2.px, LineStyle.Solid, rgb(50, 50, 50))
        }

        ".project h3" style {
            color(rgb(252, 165, 165))
        }

        ".project-description" style {
            color(rgb(200, 200, 200))
        }

        ".project-achievements" style {}

        ".project-achievements::before" style {
            color(rgb(185, 28, 28))
        }

        ".project-technologies" style {
            color(rgb(160, 160, 160))
        }

        ".project-technologies-separator" style {
            color(rgb(185, 28, 28))
        }

        ".project-link-button" style {
            backgroundColor(rgb(185, 28, 28))
            color(rgb(255, 255, 255))
        }

        ".footer" style {
            backgroundColor(rgb(30, 30, 30))
            border(2.px, LineStyle.Solid, rgb(50, 50, 50))
        }

        ".footer p" style {
            color(rgb(200, 200, 200))
        }

        ".link" style {
            color(rgb(252, 165, 165))
            backgroundColor(rgb(60, 20, 20))
        }
    }
}