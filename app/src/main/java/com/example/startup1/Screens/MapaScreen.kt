package com.example.startup1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.startup1.R

@Composable
fun MapaScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp)
        ) {
            // Cabeçalho
            Row(
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(100.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Elementos do cabeçalho
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "noticia2",
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .weight(0.5f)
                )
                Image(
                    painter = painterResource(id = R.drawable.logo1),
                    contentDescription = "noticia2",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .weight(0.5f)
                )
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = "noticia2",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .weight(0.5f)
                )
            }
        }
        // Corpo do conteúdo
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Yellow),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(text = "Jundiai na palma da mão")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
        ) {
            // OutlinedTextField e outros elementos
            OutlinedTextField(value = "", onValueChange ={},
                modifier = Modifier
                    .width(200.dp)
                    .height(30.dp)
                    .padding(bottom = 1.dp)
                    .background(Color.White),
                placeholder = {
                    Text(text = "Ver Locais no Mapa")
                }

                )
            Column(
                modifier = Modifier
                    .height(30.dp)
                    .background(Color.Gray)
                    .width(60.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.lupa),
                    contentDescription = "lupa",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(275.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            // Imagem ou outro conteúdo principal
            Image(
                painter = painterResource(id = com.example.startup1.R.drawable.maps),
                contentDescription = "novidade2",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(Color.Yellow),
            )
        {
            Column(
                modifier = Modifier
                    .width(160.dp)
                    .height(50.dp)
                    .padding(8.dp)
                    .background(Color.Yellow)
                    .offset(x = 50.dp, y = 10.dp),
            ) {
                Text(text = "Favoritos:")
            }
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .height(110.dp)
                    .padding(8.dp)
                    .background(Color.Gray),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Local1")
                Text(text = "Local2")
                Text(text = "Local3")
                Text(text = "Local4")
            }
        }
        // Rodapé
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Gray)
        ) {
            Column(
                modifier = Modifier.size(width = 400.dp, height = 500.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Copyright © 2019-2024")
            }
        }
    }
}
