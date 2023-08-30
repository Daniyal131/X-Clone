package com.example.xclone.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    object Home : Screens(
        route = "home_screen",
//        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Search : Screens(
        route = "search_screen",
//        title = "Profile",
        icon = Icons.Outlined.Search
    )

    object Community : Screens(
        route = "community_screen",
//        title = "Settings",
        icon = Icons.Outlined.Person
    )

    object Notification : Screens(
        route = "notification_screen",
//        title = "Settings",
        icon = Icons.Outlined.Notifications
    )

    object Message : Screens(
        route = "message_screen",
//        title = "Settings",
        icon = Icons.Outlined.MailOutline
    )

}
