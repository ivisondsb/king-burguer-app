package com.ivisondsb.kingburguer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ivisondsb.kingburguer.compose.KingBurguerApp
import com.ivisondsb.kingburguer.ui.theme.KingBurguerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KingBurguerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    KingBurguerApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}