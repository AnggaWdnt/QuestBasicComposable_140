package com.example.questbasiccomposable_140

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_140.ui.theme.QuestBasicComposable_140Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_140Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Login", style = TextStyle(fontSize = 30.sp))
        Text(text = "ini adalah halaman login")
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "Logo",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .padding(top = 16.dp)
        )
        Text(text = "Nama", style = TextStyle(fontSize = 20.sp))
        // Mengubah teks "Angga Widianto" menjadi warna merah
        Text(
            text = "Angga Widianto",
            style = TextStyle(fontSize = 15.sp, color = Color.Red)
        )
        Text(text = "20220140140", style = TextStyle(fontSize = 30.sp))
    }
    Image(
        painter = painterResource(id = R.drawable.angga),
        contentDescription = "Logo",
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .padding(top = 16.dp)
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_140Theme {
        Greeting("Android")
    }
}