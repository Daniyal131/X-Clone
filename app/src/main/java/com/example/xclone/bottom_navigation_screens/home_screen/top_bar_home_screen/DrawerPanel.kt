package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

//@Composable
//fun DrawerPanel(
//    scope: CoroutineScope,
//    scaffoldState: ScaffoldState
//){
//    List(10) {
//        Text(text = "item$it", modifier = Modifier.padding(horizontal = 20.dp , vertical = 10.dp))
//    }
//    IconButton(onClick = {
//        scope?.launch {scaffoldState?.drawerState?.close()}
//    }) {
//        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Close Icon")
//    }
//}


//@Composable
//fun DrawerPanel(
//    scaffoldState: ScaffoldState
//) {
//    val scope = rememberCoroutineScope()
//
//    Column {
//        LazyColumn {
//            items(10) { index ->
//                Text(
//                    text = "item$index",
//                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
//                )
//            }
//        }
//
//        IconButton(onClick = {
//            scope.launch {
//                scaffoldState.drawerState.close()
//            }
//        }) {
//            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Close Icon")
//        }
//    }
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerPanel() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
// icons to mimic drawer destinations
    val items = listOf(Icons.Default.Favorite, Icons.Default.Face, Icons.Default.Email)
    val selectedItem = remember { mutableStateOf(items[0]) }
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(Modifier.height(12.dp))
                items.forEach { item ->
                    NavigationDrawerItem(
                        icon = { Icon(item, contentDescription = null) },
                        label = { Text(item.name) },
                        selected = item == selectedItem.value,
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem.value = item
                        },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = if (drawerState.isClosed) ">>> Swipe >>>" else "<<< Swipe <<<")
                Spacer(Modifier.height(20.dp))
                Button(onClick = { scope.launch { drawerState.open() } }) {
                    Text("Click to open")
                }
            }
        }
    )
}