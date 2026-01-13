package com.barmajaa.m4md24.styles

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.opacity

object AnimationStyles : StyleSheet() {
    init {
        "@keyframes fadeIn" {
            "from" {
                opacity(0)
            }
            "to" {
                opacity(1)
            }
        }

        "@keyframes slideInRight" {
            "from" {
                property("transform", "translateX(50px)")
                opacity(0)
            }
            "to" {
                property("transform", "translateX(0)")
                opacity(1)
            }
        }

        "@keyframes slideInLeft" {
            "from" {
                property("transform", "translateX(-50px)")
                opacity(0)
            }
            "to" {
                property("transform", "translateX(0)")
                opacity(1)
            }
        }

        "@keyframes fadeInUp" {
            "from" {
                property("transform", "translateY(30px)")
                opacity(0)
            }
            "to" {
                property("transform", "translateY(0)")
                opacity(1)
            }
        }

        "@keyframes slideInUp" {
            "from" {
                property("transform", "translateY(20px)")
                opacity(0)
            }
            "to" {
                property("transform", "translateY(0)")
                opacity(1)
            }
        }

        "@keyframes scaleIn" {
            "from" {
                property("transform", "scale(0.8)")
                opacity(0)
            }
            "to" {
                property("transform", "scale(1)")
                opacity(1)
            }
        }

        ".fade-in" style {
            property("animation", "fadeIn 1s ease-in")
        }

        ".slide-in-right" style {
            property("animation", "slideInRight 1s ease-out")
        }

        ".slide-in-left" style {
            property("animation", "slideInLeft 1s ease-out")
        }

        ".fade-in-up" style {
            property("animation", "fadeInUp 1s ease-out")
        }

        ".slide-in-up" style {
            property("animation", "slideInUp 0.6s ease-out")
            property("animation-fill-mode", "both")
        }

        ".scale-in" style {
            property("animation", "scaleIn 0.5s ease-out")
            property("animation-fill-mode", "both")
        }

        (0 .. 20).forEach { index ->
            ".skill:nth-child(${index + 1})" style {
                property("animation-delay", "${index * 0.1}s")
            }
            ".project:nth-child(${index + 1})" style {
                property("animation-delay", "${index * 0.15}s")
            }
        }
    }
}