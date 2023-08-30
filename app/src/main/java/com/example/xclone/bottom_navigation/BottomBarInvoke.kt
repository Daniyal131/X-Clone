package com.example.xclone.bottom_navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarInvoke() {
    val navController: NavHostController = rememberNavController()
    val bottomBarHeight = 56.dp
    val bottomBarOffsetHeightPx = remember { mutableStateOf(0f) }

    var buttonsVisible = remember { mutableStateOf(true) }

    Scaffold(
        bottomBar = {
            BottomBar(
                navController = navController,
                state = buttonsVisible,
                modifier = Modifier
            )
        }) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
        ) {
            BottomBarNavGraph(navController = navController)
        }
    }
}