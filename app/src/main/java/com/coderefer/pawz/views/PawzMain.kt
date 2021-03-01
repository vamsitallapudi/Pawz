package com.coderefer.pawz.views

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

// Start building your app here!
@Composable
fun PawzMain(toggleTheme: ()->Unit) {
    Surface(color = MaterialTheme.colors.background) {
        Text(text = "Ready... Set... GO!")
    }
}