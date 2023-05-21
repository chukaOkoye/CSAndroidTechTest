package com.example.csandroidtechtest.view

import androidx.compose.foundation.border
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

        Column {
            Box(
                modifier = Modifier
                    .size(200.dp)  // Set the desired size of the circle
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = CircleShape
                    )  // Add an outline to the circle
                    .padding(8.dp),  // Add padding inside the circle
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Your credit score is",
                        style = TextStyle(fontSize = 16.sp),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    // Display the credit score if it's available
                    Text(
                        creditReport.creditScore.toString(),
                        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        "out of 700",
                        style = TextStyle(fontSize = 16.sp),
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
        viewModel.creditScore = 200 // Set the example credit score here

        CreditScoreView(viewModel)
    }
}