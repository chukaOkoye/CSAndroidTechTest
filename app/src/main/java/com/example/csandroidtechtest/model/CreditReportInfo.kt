package com.example.csandroidtechtest.model

import com.google.gson.annotations.SerializedName

data class CreditReportInfo(
    @SerializedName("score") val score: Int,
    @SerializedName("maxScoreValue") val maxScoreValue: Int,
    @SerializedName("minScoreValue") val minScoreValue: Int,
    @SerializedName("monthsSinceLastDefaulted") val monthsSinceLastDefaulted: Int,
    @SerializedName("monthsSinceLastDelinquent") val monthsSinceLastDelinquent: Int,
    @SerializedName("hasEverBeenDelinquent") val hasEverBeenDelinquent: Boolean,
    @SerializedName("percentageCreditUsed") val percentageCreditUsed: Int,
    @SerializedName("changedScore") val changedScore: Int,
    @SerializedName("currentShortTermDebt") val currentShortTermDebt: Int,
    @SerializedName("currentShortTermNonPromotionalDebt") val currentShortTermNonPromotionalDebt: Int,
    @SerializedName("currentShortTermCreditLimit") val currentShortTermCreditLimit: Int,
    @SerializedName("currentShortTermCreditUtilisation") val currentShortTermCreditUtilisation: Int,
    @SerializedName("changeInShortTermDebt") val changeInShortTermDebt: Int,
    @SerializedName("currentLongTermDebt") val currentLongTermDebt: Int,
    @SerializedName("currentLongTermNonPromotionalDebt") val currentLongTermNonPromotionalDebt: Int,
    @SerializedName("currentLongTermCreditLimit") val currentLongTermCreditLimit: Int?,
    @SerializedName("currentLongTermCreditUtilisation") val currentLongTermCreditUtilisation: Int?,
    @SerializedName("changeInLongTermDebt") val changeInLongTermDebt: Int,
    @SerializedName("daysUntilNextReport") val daysUntilNextReport: Int
)