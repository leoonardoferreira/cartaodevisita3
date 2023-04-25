package com.example.cartodevisita2

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    color = Color(242,102,1295)
                ) {
                    PlanodeFundo()
                }
            }
        }
    }
}

@Composable
fun PlanodeFundo() {
    Image(
        painter = painterResource(id = R.drawable.plano_de_fundo),
        contentDescription = null,
        contentScale = ContentScale.Crop, )
    Cabecalho()
    Rodape()

}
@Composable
fun Rodape() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Facebook()
        Instagram()
        Twitter()
    }

}
@Composable
fun Facebook(){
    Row(
        modifier = Modifier.padding(all = 14.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.facebook),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(28.dp)
        )
        Text(
            text = "leoonardoferreira",
            color = Color.White,
            modifier = Modifier.padding(horizontal = 10.dp)
        )
    }
}

@Composable
fun Instagram(){
    Row(
        modifier = Modifier.padding(all = 14.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.instagram),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(28.dp)
        )
        Text(
            text = "leoonardoferreira",
            color = Color.White,
            modifier = Modifier.padding(horizontal = 10.dp)
        )
    }
}

@Composable
fun Twitter(){
    Row(
        modifier = Modifier.padding(all = 14.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.twitter),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(28.dp)
        )
        Text(
            text = "leoonardoferreira",
            color = Color.White,
            modifier = Modifier.padding(horizontal = 10.dp)
        )
    }
}


@Composable
fun Cabecalho() {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id =R.drawable.nike_logo),
            contentDescription =null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(100.dp)



        )
        Text(
            text ="Leonardo Ferreira da Silva",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "Estudante",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )


    }
}