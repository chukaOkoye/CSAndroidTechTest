package com.example.csandroidtechtest.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.csandroidtechtest.model.CreditReport
import com.example.csandroidtechtest.network.ApiService
import kotlinx.coroutines.launch
import java.lang.Exception

class CreditScoreViewModel: ViewModel() {
    var scoreListResponse:List<CreditReport> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")

    fun getScoreList(){
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val scoreList = apiService.getScore()
                scoreListResponse = scoreList
            }
            catch (e:Exception){
                errorMessage = e.message.toString()
            }

        }
    }
}