package com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar

sealed class ScreenForHome(
    val route: String
){
    object ForYou: ScreenForHome (route = "for_you_screen")
    object FollowingYou: ScreenForHome (route = "following_screen")
}
