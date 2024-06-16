package com.example.startup1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.startup1.Screens.LoginScreen
import com.example.startup1.Screens.MapaScreen
import com.example.startup1.Screens.NoticiaScreen
import com.example.startup1.Screens.NovidadeScreen
import com.example.startup1.Screens.PrincipalScreen
import com.example.startup1.ui.theme.Startup1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Startup1Theme {
                Surface(
                    modifier = Modifier.fillMaxWidth(), color = Color.Magenta,
                )
                {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login")
                    {
                        composable(route = "login") { LoginScreen(navController) }
                        composable(route = "principal") { PrincipalScreen(navController) }
                        composable(route = "noticias") { NoticiaScreen(navController = navController) }
                        composable(route = "novidades") { NovidadeScreen(navController = navController) }
                        composable(route = "novidades") { NovidadeScreen(navController = navController) }
                        composable(route = "mapa") { MapaScreen(navController = navController) }

                    }
                }

            }
        }
    }
}