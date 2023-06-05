package com.ascoder.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentContainer()
        }
    }
}

@Composable
fun ComponentContainer() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF101010))) {
        Text(
            text = "Jetpack Compose",
            color = Color.White,
            fontSize = 30.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentContainer()
}