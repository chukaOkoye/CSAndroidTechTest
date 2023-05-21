import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.csandroidtechtest.view.ScoreUI
import com.example.csandroidtechtest.view.viewModel.CreditScoreViewModel
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CreditScoreViewTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun creditScoreViewDisplaysCorrectText() {
        val viewModel = CreditScoreViewModel()
        viewModel.creditScore = 514

        composeTestRule.setContent {
            ScoreUI().CreditScoreView(viewModel)
        }

        composeTestRule.onNodeWithText("Your credit score is").assertIsDisplayed()
        composeTestRule.onNodeWithText("514").assertIsDisplayed()
        composeTestRule.onNodeWithText("out of 700").assertIsDisplayed()
    }

    @Test
    fun creditScoreViewDoesNotDisplayInCorrectText() {
        val viewModel = CreditScoreViewModel()
        viewModel.creditScore = 300

        composeTestRule.setContent {
            ScoreUI().CreditScoreView(viewModel)
        }

        composeTestRule.onNodeWithText("Your credit score is").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("514").assertDoesNotExist()
        composeTestRule.onNodeWithText("out of 700").assertIsDisplayed()
    }
}
