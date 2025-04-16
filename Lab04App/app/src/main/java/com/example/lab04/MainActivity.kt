package com.example.lab04 // Asegúrate que este sea tu paquete correcto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth // Import NUEVO para ComponenteTarjetaSimple
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card // Import NUEVO para ComponenteTarjetaSimple
import androidx.compose.material3.CardDefaults // Import NUEVO para ComponenteTarjetaSimple
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    // No llamamos a los nuevos componentes aquí todavía
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}

// --- Código de Commit 1 ---
@Composable
fun ComponenteTextoSimple() {
    Text(
        text = "Este es el primer componente (Texto)",
        fontSize = 20.sp,
        color = Color.Blue
    )
}

@Preview(showBackground = true, name = "Vista Previa Texto Simple")
@Composable
fun PreviewComponenteTextoSimple() {
    ComponenteTextoSimple()
}
// --- FIN Código de Commit 1 ---


// --- Código de Commit 2 ---
@Composable
fun ComponenteIconoSimple() {
    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Icono de Favorito",
        tint = Color.Red,
        modifier = Modifier.size(48.dp)
    )
}

@Preview(showBackground = true, name = "Vista Previa Icono Simple")
@Composable
fun PreviewComponenteIconoSimple() {
    ComponenteIconoSimple()
}
// --- FIN Código de Commit 2 ---


// --- INICIO: Código añadido en Commit 3 ---
@Composable
fun ComponenteTarjetaSimple() {
    Card(
        modifier = Modifier
            .fillMaxWidth() // Ocupa el ancho disponible
            .padding(8.dp), // Margen exterior
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp) // Sombra
    ) {
        Text(
            text = "Este es el tercer componente (Tarjeta con Texto)",
            modifier = Modifier.padding(16.dp) // Relleno interior
        )
    }
}

@Preview(showBackground = true, name = "Vista Previa Tarjeta Simple")
@Composable
fun PreviewComponenteTarjetaSimple() {
    ComponenteTarjetaSimple()
}
// --- FIN: Código añadido en Commit 3 ---