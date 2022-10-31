package com.example.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Bolsominion", "Lula ladrão, roubou meu coração!"))
        }
    }
}

data class Message(val author:String, val body:String)

// @Composable é o q ativa o "React" Kotlin
@Composable
fun MessageCard(msg:Message) {
    //Definindo uma Linha com espaçamento interno de 8dp
    Row(modifier = Modifier.padding(all = 8.dp)) {
        //Desenhando o ícone com a classe Image, definindo sua altura e forma
        Image (
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "O Meu Malvado Favorito são os amigos que fazemos no caminho",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        //Espaço
        Spacer(modifier = Modifier.width(8.dp))
        //Coluna com 2 Textos e um espaço entre eles
        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = msg.body)
        }
    }
}

// @preview define como deve um método para ser pré visualizadp
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Petista", "Bolsonaro Genocída!"))
}