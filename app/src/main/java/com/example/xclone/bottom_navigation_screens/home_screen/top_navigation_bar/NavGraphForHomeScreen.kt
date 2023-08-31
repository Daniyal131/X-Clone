package com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.xclone.bottom_navigation_screens.home_screen.screens.FollowingScreen
import com.example.xclone.bottom_navigation_screens.home_screen.screens.ForYouScreen

@Composable
fun SetupNavGraphForHomeScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreenForHome.ForYou.route){
        composable(route = ScreenForHome.ForYou.route ){
            ForYouScreen()
        }
        composable(route = ScreenForHome.FollowingYou.route ){
            FollowingScreen()
        }
    }
}