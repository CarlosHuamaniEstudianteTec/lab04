package com.example.lab04 // Asegúrate que este sea tu paquete correcto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text // Import existente
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Import NUEVO para ComponenteTextoSimple
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp // Import NUEVO para ComponenteTextoSimple
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
                    // No llamamos a ComponenteTextoSimple aquí todavía
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

// --- INICIO: Código añadido en Commit 1 ---
@Composable
fun ComponenteTextoSimple() {
    Text(
        text = "Este es el primer componente (Texto)",
        fontSize = 20.sp, // Tamaño de texto de ejemplo
        color = Color.Blue  // Color de ejemplo
    )
}

@Preview(showBackground = true, name = "Vista Previa Texto Simple")
@Composable
fun PreviewComponenteTextoSimple() {
    ComponenteTextoSimple()
}
// --- FIN: Código añadido en Commit 1 ---