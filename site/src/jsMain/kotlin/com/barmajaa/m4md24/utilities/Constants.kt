package com.barmajaa.m4md24.utilities

import com.barmajaa.m4md24.models.Link
import com.barmajaa.m4md24.models.Project
import com.barmajaa.m4md24.models.Skill

object Constants {
    object Layouts {
        object Index {
            const val NAME = "محمد سعداوي ثابت"
            const val JOB_TITLE = "مطور تطبيقات أندرويد"
            const val ABOUT_ME_TITLE = "عني"
            const val ABOUT_ME = "مطور تطبيقات أندرويد بواسطة Legacy Code (Java & Kotlin) و Jetpack Compose (Kotlin)، وقمت بحل أكثر من ٣٦٠٠ سؤال ومشروع بمختلف المنصات واللغات مع التركيز على Java و Kotlin و SQL، أتميز بالبساطة في التطوير وحل المشكلات، أسعى لتعليم المسلمين ما يُفيدهم، آخذ بالأحوط في عملي وفي حياتي وأتجنب القيام بأي فعل مُحَرَّم فيه، مُستَخدِم جيد لأدوات الذكاء الإصطناعي في عملي لزيادة الإنتاجية، مُحِب للإطلاع على ما هو جديد أو غريب."
            const val SKILLS_TITLE = "المهارات"
            const val PROJECTS_TITLE = "المشاريع"
        }
    }

    object Strings {
        const val USERNAME = "m4md24"
    }

    object WhatDidIDo {
        const val CREATE_IDEA = "صناعة الفكرة"
        const val CREATE_PROJECT = "إنشاء التطبيق"
    }

    object Projects {
        fun GetAll() = listOf(
            Project(
                "واعيني",
                "تطبيق للاستشارات الطبية، وعرض معلومات طبية",
                listOf(
                    Constants.WhatDidIDo.CREATE_IDEA,
                    Constants.WhatDidIDo.CREATE_PROJECT
                ),
                listOf(
                    Constants.Skills.ANDROID_APPS_DEVELOPMENT, Constants.Skills.INTELLIJ_IDEA, Constants.Skills.JETPACK_COMPOSE, Constants.Skills.KOTLIN, Constants.Skills.JSON, Constants.Skills.MARKDOWN, Constants.Skills.DATABASE, Constants.Skills.UI_UX, Constants.Skills.GIT, Constants.Skills.GITHUB, Constants.Skills.XML
                ),
                "",
                ""
            ),
            Project(
                "اشترِ لي",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "حديث",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "كُتُبي",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "أجيال",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "صِلني",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "كُنَّاشتي",
                "",
                listOf(),
                listOf(),
                "",
                ""
            ),
            Project(
                "أدواتي",
                "",
                listOf(),
                listOf(),
                "",
                ""
            )
        )
    }

    object Skills {
        const val SOFTWARE_DEVELOPMENT = "Software Development"
        const val PROBLEM_SOLVING = "Problem Solving"
        const val ANDROID_APPS_DEVELOPMENT = "Android Apps Development"
        const val LEGACY_CODE = "Legacy Code"
        const val JETPACK_COMPOSE = "Jetpack Compose"
        const val INTELLIJ_IDEA = "Intellij IDEA"
        const val FIREBASE = "Firebase"
        const val JAVA = "Java"
        const val KOTLIN = "Kotlin"
        const val UI_UX = "UI/UX"
        const val FIGMA = "Figma"
        const val DATABASE = "Database"
        const val DATA_GRIP = "Data Grip"
        const val SQL = "SQL"
        const val T_SQL = "T-SQL"
        const val MYSQL = "MySQL"
        const val POSTGRESQL = "PostgreSQL"
        const val HSQLDB = "HSQLDB"
        const val NO_SQL = "NoSQL"
        const val WEB_DEVELOPMENT = "Web Development"
        const val WEBSTORM = "WebStorm"
        const val FLEET = "Fleet"
        const val HTML = "HTML"
        const val CSS = "CSS"
        const val JAVASCRIPT = "Javascript"
        const val DOCUMENTATION = "Documentation"
        const val WRITE_SIDE = "Writerside"
        const val MARKDOWN = "Markdown"
        const val MERMAID = "Mermaid"
        const val TEX = "Tex"
        const val GIT = "Git"
        const val GITHUB = "GitHub"
        const val JSON = "JSON"
        const val XML = "XML"
        const val CLION = "Clion"
        const val C_PLUS_PLUS = "C++"
        const val RIDER = "Rider"
        const val C_SHARP = "C#"
        const val TELEGRAM_BOT_DEVELOPMENT = "Telegram Bot Development"
        const val PYCHARM = "PyCharm"
        const val PYTHON = "Python"
        const val CALLIGRAPHY_DESIGN = "Calligraphy Design"
        const val INKSCAPE = "Inkscape"
        const val LOGO_DESIGN = "Logo Design"
        const val CANVA = "Canva"

        fun GetAll() = listOf(
            SOFTWARE_DEVELOPMENT, PROBLEM_SOLVING,
            ANDROID_APPS_DEVELOPMENT, JETPACK_COMPOSE, LEGACY_CODE, INTELLIJ_IDEA, FIREBASE, JAVA, KOTLIN,
            UI_UX, FIGMA,
            DATABASE, DATA_GRIP, SQL, T_SQL, MYSQL, POSTGRESQL, HSQLDB, NO_SQL,
            WEB_DEVELOPMENT, WEBSTORM, FLEET, HTML, CSS, JAVASCRIPT,
            DOCUMENTATION, WRITE_SIDE, MARKDOWN, MERMAID, TEX,
            GIT, GITHUB, JSON, XML,
            CLION, C_PLUS_PLUS,
            RIDER, C_SHARP,
            TELEGRAM_BOT_DEVELOPMENT, PYCHARM, PYTHON,
            CALLIGRAPHY_DESIGN, INKSCAPE, LOGO_DESIGN, CANVA
        ).map { Skill(it) }
    }

    object Links {
        val email : Link = Link("📧", "${Strings.USERNAME}@gmail.com", "mailto:${Strings.USERNAME}@gmail.com")
        val telegram : Link = Link("🗨️", "Telegram (@${Strings.USERNAME})", "https://t.me/${Strings.USERNAME}")
        val behance : Link = Link("🎨", "Behance (@${Strings.USERNAME})", "https://www.behance.net/${Strings.USERNAME}")
        val github : Link = Link("💻", "GitHub (@${Strings.USERNAME})", "https://github.com/${Strings.USERNAME}")
        val youtube : Link = Link("📺", "Youtube (@${Strings.USERNAME})", "https://www.youtube.com/@${Strings.USERNAME}")
        val linkedIn : Link = Link("💼", "LinkedIn (@${Strings.USERNAME})", "https://www.linkedin.com/in/${Strings.USERNAME}")

        fun GetAll() = listOf(
            email,
            telegram,
            behance,
            github,
            youtube,
            linkedIn
        )
    }
}