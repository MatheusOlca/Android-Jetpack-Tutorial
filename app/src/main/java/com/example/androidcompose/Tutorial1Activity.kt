
package com.example.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Tutorial1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Galdino")
        }
    }
}

// @Composable é o que ativa o "React" Kotlin
@Composable
fun MessageCard(name:String) {
    //Texto
    Text(text = "Hello $name!")
}

// @preview define como deve um método para ser pré visualizadp
@Preview
@Composable
fun PreviewMessageCard1() {
    MessageCard("Galdino")
}