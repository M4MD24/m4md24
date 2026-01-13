package com.barmajaa.m4md24.models

data class Project(
    val name : String,
    val description : String,
    val whatDidIDo : List<String>,
    val technologies : List<String>,
    val codeLink : String,
    val designLink : String,
)
