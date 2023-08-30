package com.example.xclone.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.xclone.bottom_navigation_screens.community_screen.CommunityScreen
import com.example.xclone.bottom_navigation_screens.home_screen.HomeScreen
import com.example.xclone.bottom_navigation_screens.message_screen.MessageScreen
import com.example.xclone.bottom_navigation_screens.notificaiton_screen.NotificationScreen
import com.example.xclone.bottom_navigation_screens.search_screen.SearchScreen


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