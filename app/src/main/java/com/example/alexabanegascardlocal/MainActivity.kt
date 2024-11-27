package com.example.alexabanegascardlocal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.alexabanegascardlocal.ui.theme.AlexaBanegasCardLocalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlexaBanegasCardLocalTheme {
                Surface  {
                    Modifier.fillMaxSize()
                    CardPerro()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPerro() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.Green

            ),
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp)
        ) {

            Text(
                text = "Perro Feliz",
                modifier = Modifier
                    .padding(20.dp),
                textAlign = TextAlign.Left
            )

            Image(
                painter = painterResource(id = (R.drawable.perro_1)),
                contentDescription = "perro_1",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillWidth
            )

        }


    }
}