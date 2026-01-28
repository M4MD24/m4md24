package com.barmajaa.m4md24.styles

import com.varabyte.kobweb.compose.css.content
import org.jetbrains.compose.web.css.*

object SimpleStyles : StyleSheet() {
    init {
        "*" style {
            margin(0.px)
            padding(0.px)
            property("box-sizing", "border-box")
            property("-webkit-tap-highlight-color", "transparent")
        }

        "html" style {
            height(100.percent)
            property("transition", "background-color 0.3s, color 0.3s")
        }

        "body" style {
            fontFamily("'Segoe UI', Tahoma, Geneva, Verdana, sans-serif")
            property("direction", "rtl")
            property("transition", "background-color 0.3s, color 0.3s")
            minHeight(100.percent)
        }

        "br" style {
            property("user-select", "none")
            property("-webkit-user-select", "none")
            property("-moz-user-select", "none")
            property("-ms-user-select", "none")
        }

        "hr" style {
            property("border", "none")
            property("border-top", "0.2rem solid none")
        }

        ".page" style {
            width(100.percent)
            margin(0.px)
            padding(20.px)
            position(Position.Relative)
        }

        ".theme-toggle" style {
            position(Position.Fixed)
            top(20.px)
            left(20.px)
            padding(12.px, 20.px)
            fontSize(1.5.em)
            border(0.px)
            borderRadius(50.px)
            cursor("pointer")
            property("z-index", "1000")
            property("transition", "all 0.3s")
            property("box-shadow", "0 4px 15px rgba(0,0,0,0.2)")
        }

        ".theme-toggle:hover" style {
            property("transform", "scale(1.1)")
        }

        ".header" style {
            textAlign("center")
            padding(50.px, 20.px)
            borderRadius(15.px)
            marginBottom(40.px)
            property("transition", "all 0.3s")
        }

        ".header h1" style {
            fontSize(3.em)
            marginBottom(15.px)
            fontWeight("bold")
        }

        ".header p" style {
            fontSize(1.3.em)
        }

        ".section" style {
            marginBottom(50.px)
            padding(30.px)
            borderRadius(15.px)
            property("transition", "all 0.3s")
        }

        ".section h2" style {
            fontSize(2.2.em)
            marginBottom(25.px)
            fontWeight("bold")
            property("border-bottom", "3px solid")
            paddingBottom(10.px)
            display(DisplayStyle.InlineBlock)
        }

        ".section p" style {
            fontSize(1.2.em)
            property("line-height", "1.8")
        }

        ".skills" style {
            display(DisplayStyle.Flex)
            flexWrap(FlexWrap.Wrap)
            gap(15.px)
            flexDirection(FlexDirection.RowReverse)
        }

        ".skill" style {
            padding(12.px, 24.px)
            borderRadius(25.px)
            fontSize(1.1.em)
            fontWeight("600")
            property("transition", "all 0.3s")
            property("direction", "ltr")
            cursor("pointer")
        }

        ".skill:hover" style {
            property("transform", "translateY(-5px) scale(1.05)")
            property("box-shadow", "0 5px 15px rgba(0,0,0,0.2)")
        }

        ".projects" style {
            display(DisplayStyle.Grid)
            property("grid-template-columns", "repeat(auto-fit, minmax(300px, 1fr))")
            gap(25.px)
        }

        ".project" style {
            padding(25.px)
            borderRadius(15.px)
            property("transition", "all 0.3s")
            cursor("pointer")
        }

        ".project:hover" style {
            property("transform", "translateY(-10px)")
            property("box-shadow", "0 10px 30px rgba(0,0,0,0.15)")
        }

        ".project h3" style {
            fontSize(1.6.em)
            marginBottom(12.px)
            fontWeight("bold")
        }

        ".project-description" style {
            fontSize(1.1.em)
            marginBottom(12.px)
            property("line-height", "1.6")
            fontStyle("italic")
        }

        ".project-achievements" style {}

        ".project-achievements::before" style {
            content("- ")
        }

        ".project-technologies" style {
            fontSize(0.95.em)
            fontWeight("600")
            opacity(0.8)
            property("direction", "ltr")
        }

        ".project-technologies-separator" style {}

        ".project-link-button" style {
            padding(10.px, 20.px)
            borderRadius(8.px)
            textDecoration("none")
            fontWeight("600")
            display(DisplayStyle.InlineBlock)
            property("transition", "all 0.3s")
            cursor("pointer")
        }

        ".project-link-button:hover" style {
            property("transform", "translateY(-3px)")
            property("box-shadow", "0 5px 15px rgba(0,0,0,0.2)")
        }

        ".footer" style {
            textAlign("center")
            padding(40.px)
            borderRadius(15.px)
            marginTop(50.px)
            property("direction", "ltr")
        }

        ".footer p" style {
            fontSize(1.1.em)
            property("line-height", "2.2")
        }

        ".link" style {
            textDecoration("none")
            fontWeight("600")
            padding(8.px, 15.px)
            borderRadius(8.px)
            display(DisplayStyle.InlineBlock)
            margin(5.px)
            property("transition", "all 0.3s")
        }

        ".link:hover" style {
            property("transform", "translateY(-3px)")
            property("box-shadow", "0 5px 15px rgba(0,0,0,0.2)")
        }
    }
}