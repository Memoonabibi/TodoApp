package com.example.mytodoapp.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mytodoapp.components.topbar.TopAppBar
import com.example.mytodoapp.components.topbar.todocounter.TodoCounter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTodoAppTheme {
                Scaffold (

                    topBar = { TopAppBar() },

                    modifier = Modifier
                    .fillMaxSize()
                ) {innerPadding ->
                    App( innerPadding = innerPadding)
                }
            }
        }
    }
}

