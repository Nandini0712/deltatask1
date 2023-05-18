package com.example.wordjumble

import android.content.Intent
import android.os.Bundle

import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wordjumble.ui.theme.WordJumbleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val button1 = findViewById<Button>(R.id.button)

        button1.setOnClickListener {
            Toast.makeText(this, " game will start soon ", Toast.LENGTH_LONG).show()
            val intent = Intent(this, PAGE2::class.java)
            startActivity(intent)
        }
        super.onCreate(savedInstanceState)
        setContent {
            WordJumbleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
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
    WordJumbleTheme {
        Greeting("Android")
    }
}