package com.example.susunshun.tropnote.model
import java.util.Date
/**
 * Created by 01017031 on 2018/05/27.
 */



data class Plan (
    val id: String,
    val name: String,
    val dateFrom: Date,
    val dateTo: Date
)