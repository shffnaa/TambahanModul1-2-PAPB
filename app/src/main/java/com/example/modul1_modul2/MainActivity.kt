package com.example.modul1_modul2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.modul1_modul2.ui.theme.Modul1Modul2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TugasPraktikum()
        }
    }
}

@Composable
fun TugasPraktikum() {
    val angka = 5
    val hasil = 100 / angka

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Tugas Praktikum Compose",
                fontSize = 22.sp
            )

            AsyncImage(
                model = "https://picsum.photos/800/600",
                contentDescription = "Gambar praktikum",
                modifier = Modifier
                    .height(200.dp)
                    .padding(top = 16.dp)
            )

            Text(
                text = "Hasil: $hasil",
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}



