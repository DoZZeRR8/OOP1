package com.example.oop1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oop1.ui.theme.OOP1Theme





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OOP1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Cyan) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Greeting(name = "Hello", modifier = Modifier.fillMaxWidth(), fontSize = 150.0)
                        Greeting(name = "World!", modifier = Modifier.fillMaxWidth(), fontSize = 120.0)
                    }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, fontSize:Double ) {
    Text(
        color = Color.White,
        text = "$name ",
        modifier = modifier,
        fontSize = fontSize.sp,
    )

}
}