package com.example.csandroidtechtest.view.viewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.csandroidtechtest.network.ApiService
import kotlinx.coroutines.launch

class CreditScoreViewModel : ViewModel() {
    var creditScore by mutableStateOf(0)
    private var errorMessage by mutableStateOf("")

    fun getScore() {
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val response = apiService.getScore()
                Log.d("API Response", response.toString())
                creditScore = response.creditReportInfo.score
            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}