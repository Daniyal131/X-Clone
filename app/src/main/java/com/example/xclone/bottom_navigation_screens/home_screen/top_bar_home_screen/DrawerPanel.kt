package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerPanel(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState
){
    List(10) {
        Text(text = "item$it", modifier = Modifier.padding(horizontal = 20.dp , vertical = 10.dp))
    }
    IconButton(onClick = {
        scope?.launch {scaffoldState?.drawerState?.close()}
    }) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Close Icon")
    }
}
