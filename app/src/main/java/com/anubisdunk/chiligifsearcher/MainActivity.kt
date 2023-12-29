package com.anubisdunk.chiligifsearcher

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.anubisdunk.chiligifsearcher.ui.ChiliGifApp
import com.anubisdunk.chiligifsearcher.ui.theme.ChiliGifSearcherTheme


class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChiliGifSearcherTheme {
                ChiliGifApp()
            }
        }
    }
}


