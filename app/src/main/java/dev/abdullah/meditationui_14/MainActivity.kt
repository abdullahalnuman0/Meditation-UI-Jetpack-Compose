package dev.abdullah.meditationui_14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import dev.abdullah.meditationui_14.ui.HomeScreen
import dev.abdullah.meditationui_14.ui.theme.DarkerButtonBlue
import dev.abdullah.meditationui_14.ui.theme.DeepBlue
import dev.abdullah.meditationui_14.ui.theme.MeditationUI_14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        window.statusBarColor = DeepBlue.toArgb()
        setContent {
            MeditationUI_14Theme {
                HomeScreen()
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
    MeditationUI_14Theme {
        Greeting("Android")
    }
}


