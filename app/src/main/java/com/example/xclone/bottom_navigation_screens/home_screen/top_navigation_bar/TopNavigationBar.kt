package com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.xclone.bottom_navigation_screens.notificaiton_screen.NotificationScreen

@Composable
fun TopNavigationBar() {
    val configuration = LocalConfiguration.current
    val screenWidth: Dp = configuration.screenWidthDp.dp

    var for_you_selected: Boolean by remember {
        mutableStateOf(true)
    }

    Row(modifier = Modifier.fillMaxWidth()){
        Column(modifier = Modifier.width(screenWidth/2)) {
            Text(
                text = "For you" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        for_you_selected = true
                    }
                    .padding(5.dp) ,
                textAlign = TextAlign.Center,
            )
            if(for_you_selected){
                Divider(color = Color(0xff00d2ff) , thickness = 4.dp , modifier = Modifier
                    .padding(horizontal = 70.dp)
                    .clip(
                        RoundedCornerShape(2.dp)
                    ) )
            }
        }
        Column(modifier = Modifier.width(screenWidth/2)){
            Text(
                text = "Following" ,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        for_you_selected = false
                    }
                    .padding(5.dp) ,
                textAlign = TextAlign.Center
            )
            if(!for_you_selected){
                Divider(color = Color(0xff00d2ff) , thickness = 4.dp , modifier = Modifier
                    .padding(horizontal = 62.dp)
                    .clip(
                        RoundedCornerShape(2.dp)
                    ) )
            }
        }

    }
    Divider(color = Color.Gray , thickness = 1.dp)
}

@Preview(showBackground = true)
@Composable
fun TopNavigationBarPreview() {
    TopNavigationBar()
}