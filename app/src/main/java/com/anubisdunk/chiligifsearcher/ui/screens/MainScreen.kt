package com.anubisdunk.chiligifsearcher.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun MainScreen(modifier: Modifier = Modifier, viewModel: MainScreenViewModel) {

    OutputGridList(viewModel = viewModel)
}


