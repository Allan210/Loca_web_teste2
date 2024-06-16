package com.example.startup1.Screens

import androidx.annotation.RequiresPermission
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
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.illegalDecoyCallException
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.savedstate.R
import org.w3c.dom.Text
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController



@Composable

fun PrincipalScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {


        Row(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = com.example.startup1.R.drawable.menu),
                contentDescription = "noticia2",
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp)
                    .weight(0.5f)
            )
            Image(
                painter = painterResource(id = com.example.startup1.R.drawable.logo1),
                contentDescription = "noticia2",
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .weight(0.5f)
            )
            Image(
                painter = painterResource(id = com.example.startup1.R.drawable.perfil),
                contentDescription = "noticia2",
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .weight(0.5f)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = com.example.startup1.R.drawable.parque2),
                contentDescription = "parque",
                modifier = Modifier
                    .fillMaxWidth(10f)
                    .height(150.dp)
            )
        }
//        cabecalho
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Noticias",modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .offset(x = 60.dp , y = 10.dp)
                .weight(0.5f)
            )
            Text(text = "Novidades",modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .offset(x = 60.dp , y = 10.dp)
                .weight(0.5f))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
                    .background(Color.Green)
                    .weight(0.5f)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.noticia2),
                    contentDescription = "noticia2",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(85.dp)
                )
                Text(text = "Jundiai abre incrições para turmas de beach tennis 2024 no dia 03")
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
                    .background(Color.Yellow)
                    .weight(0.5f)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.novidade1),
                    contentDescription = "novidade1",
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
                .height(200.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
                    .background(Color.Red)
                    .weight(0.5f)
            ) {
                Image(
                    painter = painterResource(id = com.example.startup1.R.drawable.noticia1),
                    contentDescription = "noticia1",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(85.dp)
                        .border(1.dp, Color.Black, shape = RoundedCornerShape(0.dp))
                )
                Text(text = "Guarda flagra motoboy com placa de moto clonada")
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
                    .background(Color.Yellow)
                    .weight(0.5f)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = com.example.startup1.R.drawable.carrefour),
                        contentDescription = "novidade",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(95.dp)
                    )
                }
                Text(text = "Carrefour anuncia 50% de desconto em produtos automotivos válidos até o final de semana")
            }

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .background(Color.White)) {
            Button(
                onClick = { navController.navigate("noticias") },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(0.8f)
                    .padding(8.dp)
            ) {
                Text(text = "Ver mais noticias")
            }
            Button(
                onClick = { navController.navigate("novidades") },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(0.8f)
                    .padding(8.dp)
            )
            {
                Text(text = "Ver mais novidades")
            }
        }
//        rodape
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
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
fun SquareButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = modifier.size(120.dp),
    ) {
        Text(text = "Botão Quadrado")
    }
}