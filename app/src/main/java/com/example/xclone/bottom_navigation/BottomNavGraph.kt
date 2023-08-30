package com.example.xclone.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.xclone.bottom_navigation_screens.CommunityScreen
import com.example.xclone.bottom_navigation_screens.HomeScreen
import com.example.xclone.bottom_navigation_screens.MessageScreen
import com.example.xclone.bottom_navigation_screens.NotificationScreen
import com.example.xclone.bottom_navigation_screens.SearchScreen


@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Home.route){
        composable(Screens.Home.route){
            HomeScreen()
        }
        composable(Screens.Search.route){
            SearchScreen()
        }
        composable(Screens.Community.route){
            CommunityScreen()
        }
        composable(Screens.Notification.route){
            NotificationScreen()
        }
        composable(Screens.Message.route){
            MessageScreen()
        }
    }
}