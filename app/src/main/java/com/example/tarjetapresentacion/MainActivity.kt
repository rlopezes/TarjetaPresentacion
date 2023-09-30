package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB9E1CF))
    ) {
        TituloTarjeta()
        Spacer(Modifier.height(150.dp))
        DatosTarjeta()
    }
}

@Composable
fun TituloTarjeta(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .background(Color(0xFF0F492F))
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Rubén López",
            fontSize = 50.sp,
            modifier = Modifier
                .padding(10.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "Profesor IES La Paloma",
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp),
            color = Color(0xFF368543)
        )
    }
}

@Composable
fun DatosTarjeta(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .padding(start = 50.dp)
    ) {
        Row(
            modifier = modifier
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Call,
                contentDescription = "Localized description"
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "(+34) 699 699 157",
                fontSize = 20.sp
            )
        }
        Row (
            modifier = modifier
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Localized description"
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "rlopez.es@gmail.com",
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}