package com.learning.tafsirsainsapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.learning.tafsirsainsapp.repository.MainRepo

class MainViewModelFactory(private val repo: MainRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repo) as T
    }
}