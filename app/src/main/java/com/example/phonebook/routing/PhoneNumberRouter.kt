package com.example.phonebook.routing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


sealed class Screen {
    object Contacts: Screen()
    object SaveContact: Screen()
    object Trash: Screen()
    object Favorite: Screen()
}

object PhoneNumberRouter {
    var currentScreen: Screen by mutableStateOf(Screen.Contacts)

    fun navigateTo(destination: Screen) {
        currentScreen = destination
    }
}