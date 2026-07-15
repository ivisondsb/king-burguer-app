package com.ivisondsb.kingburguer.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ivisondsb.kingburguer.compose.login.LoginScreen
import com.ivisondsb.kingburguer.ui.theme.KingBurguerTheme

@Composable
fun KingBurguerApp(modifier: Modifier = Modifier) {
    Column(modifier.padding(horizontal = 8.dp)) {
        val navController = rememberNavController()
        KingBurguerNavHost(navController)
    }
}

@Composable
fun KingBurguerNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController, startDestination = Screen.LOGIN.route
    ) {
        composable(Screen.LOGIN.route) {
            LoginScreen()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun KingBurguerAppPreview() {
    KingBurguerTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            KingBurguerApp(modifier = Modifier.padding(innerPadding))
        }
    }
}