package com.example.xclone.bottom_navigation_screens.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen.CustomTopAppBar
import com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen.TopAppBar
import com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar.TopNavigationBar

//import com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar.SetupNavGraphForHomeScreen

@Composable
fun HomeScreen() {
//    val navController: NavHostController = rememberNavController()
    LazyColumn {
        item {
            CustomTopAppBar()
//            TopAppBar()
            TopNavigationBar()
//            SetupNavGraphForHomeScreen(navController = navController)
        }
    }
}