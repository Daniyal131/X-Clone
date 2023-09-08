package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.SAVED_STATE_REGISTRY_OWNER_KEY
import kotlinx.coroutines.launch

@Composable
fun DrawerPanelContent() {
    Surface(modifier = Modifier.fillMaxWidth(0.8f)) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                , Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Here Need to add profile pic of the user and in onclick go to the profile"
                    )
                }

//            Spacer(modifier = Modifier.width(16.dp))

                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = "Drawer Panel Setting Icon through which we can logout and change the account"
                    )
                }
            }

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)) {
                val name = "Muhammad Daniyal Khan"
                val userName = "@daniiiyal01"
                val follower = "10"
                val following = "10"
                Text(text = name , fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.size(2.dp) )
                Text(text = userName)
                Spacer(modifier = Modifier.size(10.dp))
                Row {
                    Text(text = "$following following  ")
                    Text(text = "$follower follower")
                }
                Spacer(modifier = Modifier.size(10.dp))

                Divider(color = Color.Gray , thickness = 1.dp)

                Spacer(modifier = Modifier.size(20.dp))

                Row(verticalAlignment = Alignment.CenterVertically , modifier = Modifier.fillMaxWidth().clickable {  }.padding(vertical = 20.dp)){
                    Icon(imageVector = Icons.Outlined.Person, contentDescription = "Profile In the drawer Panel")
                    Text(text = "Profile" ,
                        fontWeight = FontWeight.Bold ,
                        modifier = Modifier.padding(horizontal = 20.dp),
                        fontSize = 20.sp
                    )
                }


                Row(verticalAlignment = Alignment.CenterVertically , modifier = Modifier.fillMaxWidth().clickable {  }.padding(vertical = 20.dp)){                    Icon(imageVector = Icons.Outlined.Check, contentDescription = "Profile In the drawer Panel")
                    Text(text = "Blue" ,
                        fontWeight = FontWeight.Bold ,
                        modifier = Modifier.padding(horizontal = 20.dp),
                        fontSize = 20.sp
                    )
                }


                Row(verticalAlignment = Alignment.CenterVertically , modifier = Modifier.fillMaxWidth().clickable {  }.padding(vertical = 20.dp)){                    Icon(imageVector = Icons.Outlined.Warning, contentDescription = "Profile In the drawer Panel")
                    Text(text = "Bookmarks" ,
                        fontWeight = FontWeight.Bold ,
                        modifier = Modifier.padding(horizontal = 20.dp),
                        fontSize = 20.sp
                    )
                }


                Row(verticalAlignment = Alignment.CenterVertically , modifier = Modifier.fillMaxWidth().clickable {  }.padding(vertical = 20.dp)){                    Icon(imageVector = Icons.Outlined.List, contentDescription = "Profile In the drawer Panel")
                    Text(text = "Lists" ,
                        fontWeight = FontWeight.Bold ,
                        modifier = Modifier.padding(horizontal = 20.dp),
                        fontSize = 20.sp
                    )
                }


                Row(verticalAlignment = Alignment.CenterVertically , modifier = Modifier.fillMaxWidth().clickable {  }.padding(vertical = 20.dp)){                    Icon(imageVector = Icons.Outlined.Phone, contentDescription = "Profile In the drawer Panel")
                    Text(text = "Spaces" ,
                        fontWeight = FontWeight.Bold ,
                        modifier = Modifier.padding(horizontal = 20.dp),
                        fontSize = 20.sp
                    )
                }

                Spacer(modifier = Modifier.size(20.dp))

                Divider(color = Color.Gray , thickness = 1.dp)

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerPanelContentPreview() {
    DrawerPanelContent()
}