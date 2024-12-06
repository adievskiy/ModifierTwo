package com.example.modifiertwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiertwo.ui.theme.ModifierTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val myModifier: Modifier = Modifier
            .padding(start = 100.dp, top = 40.dp)
            .border(width = 3.dp, color = Color.Yellow, shape = CircleShape)
            .clip(shape = CircleShape)
            .background(color = Color.Cyan)
            .padding(80.dp)
        setContent {
            Greeting("Привет", myModifier)
        }
    }
}

@Composable
fun Greeting(
    name: String,
    textModifier: Modifier = Modifier
        .padding(start = 160.dp, top = 40.dp)
) {
    val defaultModifier = Modifier
    Text(text = name, defaultModifier.then(textModifier))
}