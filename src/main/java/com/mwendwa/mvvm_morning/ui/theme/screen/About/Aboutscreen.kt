package com.mwendwa.mvvm_morning.ui.theme.screen.About

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mwendwa.mvvm_morning.ui.theme.screen.Home.HomeScreen

@Composable
fun About() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
    {
        Text(
            text = "This is Our About Page",
            color = Color.Magenta,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp
        )

    }

}

@Preview
@Composable
private fun Aboutprev() {
    About()
}