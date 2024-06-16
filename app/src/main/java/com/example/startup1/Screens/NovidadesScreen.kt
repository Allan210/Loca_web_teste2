package com.example.startup1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.startup1.R

@Composable
fun NovidadeScreen(navController: NavController) {
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
            Row(
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(100.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
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
//        cabeçalho
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(text = "Novidades")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .height(200.dp)
                    .offset(x = 0.dp, y = 0.dp)
                    .background(Color.Yellow)
                    .width(180.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.novidade1),
                    contentDescription = "novidade2",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(85.dp)
                )
                Text(text = "Rede Boa inaugura nova loja na Av nove de julho")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(245.dp)
                .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .height(230.dp)
                    .background(Color.Yellow)
                    .width(180.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.carrefour),
                    contentDescription = "novidade",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(95.dp)
                )
                Text(text = "Carrefour anuncia 50% de desconto em produtos automotivos válidos até o final de semana")
            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(45.dp)
            .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Ver Locais no mapa", color = Color.Blue,
                modifier = Modifier
                    .clickable { navController.navigate("mapa") }
            )
        }
//        rodape
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