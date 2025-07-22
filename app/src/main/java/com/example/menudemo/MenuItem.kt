package com.example.menudemo

data class MenuItem(
    val name: String,
    val description: String = "",
    val price: String = "",
    val isSection: Boolean = false
)
