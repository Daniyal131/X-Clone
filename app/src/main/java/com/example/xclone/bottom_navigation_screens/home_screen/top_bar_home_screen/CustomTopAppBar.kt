package com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xclone.R


@Composable
fun CustomTopAppBar(){
//    Row(horizontalArrangement = Arrangement.SpaceBetween,
//    modifier = Modifier.fillMaxWidth(),
//    verticalAlignment = Alignment.CenterVertically){
//      IconButton(onClick = {
////          scope?.launch {scaffoldState?.drawerState?.open()}
//      }) {
//         Icon(Icons.Filled.Menu , contentDescription = null)
//
//      }
//        Text(text = "X Clone")
//    }
    Row{
        IconButton(onClick = {
//          scope?.launch {scaffoldState?.drawerState?.open()}
      }) {
         Icon(Icons.Filled.Menu , contentDescription = null)
      }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.run { fillMaxWidth().padding(vertical = 16.dp) },
            verticalAlignment = Alignment.CenterVertically){
//      IconButton(onClick = {
////          scope?.launch {scaffoldState?.drawerState?.open()}
//      }) {
//         Icon(Icons.Filled.Menu , contentDescription = null)
//
//      }
            Text(text = "X Clone")
    }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomTopAppBarPreview() {
    CustomTopAppBar()
} 