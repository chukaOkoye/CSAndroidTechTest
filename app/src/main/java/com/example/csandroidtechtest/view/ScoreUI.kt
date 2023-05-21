package com.example.csandroidtechtest.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.csandroidtechtest.view.viewModel.CreditScoreViewModel

class ScoreUI {
    @Composable
    fun CreditScoreView(creditReport: CreditScoreViewModel) {
        LaunchedEffect(Unit) {
            creditReport.getScore()
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(bottom = 300.dp)){
            Box(
                modifier = Modifier
                    .size(250.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Your credit score is",
                        style = TextStyle(fontSize = 18.sp),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 0.dp)
                    )
                    Text(
                        creditReport.creditScore.toString(),
                        style = TextStyle(fontSize = 70.sp, fontWeight = FontWeight.Light),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 0.dp)
                    )
                    Text(
                        "out of 700",
                        style = TextStyle(fontSize = 18.sp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
    @Preview
    @Composable
    fun CreditScoreViewPreview() {
        val viewModel = CreditScoreViewModel()
        viewModel.creditScore = 200

        CreditScoreView(viewModel)
    }
}