package com.example.startup1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController



@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color.Magenta)
    ) {
        Column(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(650.dp)
        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.logo2),
                    contentDescription = "logo",
                    modifier = Modifier
                        .offset(x = 0.dp, y = 80.dp)
                        .padding(top = 16.dp)
                        .border(1.dp, Color.Magenta, shape = RoundedCornerShape(8.dp))
                )

            }
            Column(
                modifier = Modifier.size(width = 400.dp, height = 700.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,


                ) {

                BotaoP(texto = "Entrar com o Facebook", navController = navController)
                BotaoP(texto = "Entrar com o celular", navController = navController)
                BotaoP(texto = "Entrar com o Google", navController = navController)
                BotaoP(texto = "Primeiro Acesso", navController = navController)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(Color.Gray)
        ) {
            Column(
                modifier = Modifier.size(width = 400.dp, height = 500.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(text = "Copyright © 2019-2024")
            }
        }

    }
}

@Composable
fun BotaoP(texto: String, navController: NavController) {
    Button(
        onClick = { navController.navigate("principal") },
    ) {
        Text(text = texto)
    }
}
