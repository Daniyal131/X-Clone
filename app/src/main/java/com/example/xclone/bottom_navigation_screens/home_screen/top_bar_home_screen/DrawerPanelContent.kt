package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Composable
fun DrawerPanelContent() {
    Column (modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier.fillMaxWidth() , Arrangement.SpaceEvenly){
            IconButton(onClick = {

            }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Here Need to add profile pic of the user and in onclick go to the profile"
                )
            }

            IconButton(onClick = {

            }) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "Drawer Panel Setting Icon through which we can logout and change the account"
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DrawerPanelContentPreview() {
    DrawerPanelContent()
}