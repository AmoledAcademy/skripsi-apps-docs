package com.learning.tafsirsainsapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.learning.tafsirsainsapp.repository.BookRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BookViewModel(val repo: BookRepo) : ViewModel() {

    val downloadLiveData get() = repo.downloadLiveData

    fun downloadFile(url: String, fileName: String) {
        CoroutineScope(Dispatchers.IO).launch {
            repo.downloadPdf(
                url = url,
                fileName = fileName
            )
        }
    }

}