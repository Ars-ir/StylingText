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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
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
    val fontFamily = FontFamily(
        Font(R.font.lexend_black, FontWeight.Black),
        Font(R.font.lexend_bold, FontWeight.Bold),
        Font(R.font.lexend_extra_bold, FontWeight.ExtraBold),
        Font(R.font.lexend_extra_light, FontWeight.ExtraLight),
        Font(R.font.lexend_light, FontWeight.Light),
        Font(R.font.lexend_medium, FontWeight.Medium),
        Font(R.font.lexend_regular, FontWeight.Normal),
        Font(R.font.lexend_semi_bold, FontWeight.SemiBold),
        Font(R.font.lexend_thin, FontWeight.Thin)
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF101010))) {
        Text(
            text = builderAnnotation(),
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Composable
fun builderAnnotation(): AnnotatedString {
    return buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontSize = 30.sp
            )
        ) {
            append("G")
        }
        append("ulity ")
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontSize = 30.sp
            )
        ) {
            append("O")
        }
        append("f ")
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontSize = 30.sp
            )
        ) {
            append("A")
        }
        append("ll ")
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontSize = 30.sp
            )
        ) {
            append("T")
        }
        append("he ")
        withStyle(
            style = SpanStyle(
                color = Color.Green,
                fontSize = 30.sp
            )
        ) {
            append("G")
        }
        append("ood")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentContainer()
}