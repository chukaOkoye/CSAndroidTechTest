package com.example.csandroidtechtest.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.csandroidtechtest.model.CreditReport

@Composable
fun CreditScoreView(creditReport: CreditReport){
    Column {
        Text("Your credit score is", style = TextStyle(fontSize = 16.sp))
        Text(creditReport.score.toString(), style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
        Text("out of 700", style = TextStyle(fontSize = 16.sp))
    }
}

@Preview
@Composable
fun CreditScoreViewPreview() {
    val creditReport = CreditReport(650)
    CreditScoreView(creditReport)
}
