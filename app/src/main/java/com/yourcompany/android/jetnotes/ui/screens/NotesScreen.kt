package com.yourcompany.android.jetnotes.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yourcompany.android.jetnotes.routing.Screen
import com.yourcompany.android.jetnotes.viewmodel.MainViewModel

@Composable
fun NotesScreen(viewModel: MainViewModel) {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.Notes.route ){
        composable(Screen.Notes.route){
            NotesScreen(viewModel = viewModel)
        }
    }

}