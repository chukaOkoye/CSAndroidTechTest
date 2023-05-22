package com.example.csandroidtechtest

import com.example.csandroidtechtest.view.viewModel.CreditScoreViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class CreditScoreViewModelTest {

    private lateinit var viewModel: CreditScoreViewModel

    @Before
    fun setup() {
        viewModel = CreditScoreViewModel()
    }

    @Test
    fun testGetCorrectScore() {
        var score = viewModel.getScore()

    // Verify that the credit score is updated correctly
        assertEquals(514, viewModel.creditScore)
    }
}