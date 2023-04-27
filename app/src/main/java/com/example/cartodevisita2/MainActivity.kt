package com.example.cartodevisita2

import android.media.Image
import android.media.TimedText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita2.ui.theme.CartãoDeVisita2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisita2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(166, 126, 207)
                ) {
                    PlanodeFundo()
                }
            }
        }
    }
}

@Composable
fun PlanodeFundo() {
    Cabecalho()
    Rodape()
}

@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id =R.drawable.pfp),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(
                    width = 5.dp,
                    color = Color(104, 53, 156),
                    shape = CircleShape
                )
        )
        Text(
            text ="Leonardo Ferreira da Silva",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            color = Color(104, 53, 156),
            modifier = Modifier
                .padding(top = 10.dp)
        )
        Text(
            text = "Estudante",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(219, 199, 240)
        )
    }
}

@Composable
fun Rodape() {
    Column(
        modifier = Modifier.padding(bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Contatos(
                painter = painterResource(id = R.drawable.whatsapp),
                text = "11 994727204"
            )
            Contatos(
                painter = painterResource(id = R.drawable.instagram),
                text = "leoonaardoferreira"
            )
            Contatos(
                painter = painterResource(id = R.drawable.email),
                text = "leonardoferreira2@outlook.com.br"
            )
        }
    }
}

@Composable
fun Contatos(painter: Painter, text: String){
    Row(
        modifier = Modifier.padding(all = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(30.dp)
        )
        Text(
            text = text,
            fontSize = 15.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 10.dp),
            fontWeight = FontWeight.Bold
        )
    }
}