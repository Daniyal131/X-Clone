package com.example.xclone.bottom_navigation_screens.home_screen.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ForYouScreen() {
    Box(modifier = Modifier.fillMaxSize()
        ,contentAlignment = Alignment.Center){

        Column {
            Text(text = "For You Screen")
        }
    }
}

