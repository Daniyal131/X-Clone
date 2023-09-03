package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar.SetupNavGraphForHomeScreen
import com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar.TopNavigationBar
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    val navController: NavHostController = rememberNavController()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                title = {
//                    Text(
//                        "X Clone",
//                        maxLines = 1,
//                        overflow = TextOverflow.Ellipsis
//                    )
//                },
//                navigationIcon = {
//                    IconButton(onClick = { /* doSomething() */ }) {
//                        Icon(
//                            imageVector = Icons.Filled.Menu,
//                            contentDescription = "Localized description"
//                        )
//                    }
//                },
//            )
//        }) {contentPadding ->
//        Column{
//            Text(text = "Jetpack Compose App Bar Example",
//                modifier = Modifier.padding(contentPadding))
//            TopNavigationBar()
//        }
//    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "X Clone",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        scope.launch { drawerState.open() }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        }
    ) {
//        val items = listOf(Icons.Default.Favorite, Icons.Default.Face, Icons.Default.Email)
//        val selectedItem = remember { mutableStateOf(items[0]) }
//        ModalDrawerSheet {
//            Spacer(Modifier.height(12.dp))
//            items.forEach { item ->
//                NavigationDrawerItem(
//                    icon = { Icon(item, contentDescription = null) },
//                    label = { Text(item.name) },
//                    selected = item == selectedItem.value,
//                    onClick = {
//                        scope.launch { drawerState.close() }
//                        selectedItem.value = item
//                    },
//                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
//                )
//            }
//        }
        Column(modifier = Modifier.fillMaxSize()) {
            Divider(color = Color.Gray , thickness = 1.dp , modifier = Modifier.padding(it))
            TopNavigationBar(navController)
            SetupNavGraphForHomeScreen(navController = navController)
//            val items = listOf(Icons.Default.Favorite, Icons.Default.Face, Icons.Default.Email)
//            val selectedItem = remember { mutableStateOf(items[0]) }
//                ModalDrawerSheet {
//                    Spacer(Modifier.height(12.dp))
//                    items.forEach { item ->
//                        NavigationDrawerItem(
//                            icon = { Icon(item, contentDescription = null) },
//                            label = { Text(item.name) },
//                            selected = item == selectedItem.value,
//                            onClick = {
//                                scope.launch { drawerState.close() }
//                                selectedItem.value = item
//                            },
//                            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
//                        )
//                    }
//                }
        }
    }
}