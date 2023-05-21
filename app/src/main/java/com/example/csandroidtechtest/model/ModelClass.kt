package com.example.csandroidtechtest.model

import com.google.gson.annotations.SerializedName

data class ModelClass(
    @SerializedName("creditReportInfo") val creditReportInfo: CreditReportInfo
)