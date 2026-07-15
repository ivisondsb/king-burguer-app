package com.ivisondsb.kingburguer.compose.login

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ivisondsb.kingburguer.ui.theme.KingBurguerTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

}

@Preview
@Composable
private fun LoginScreenPreview() {
    KingBurguerTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LoginScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}