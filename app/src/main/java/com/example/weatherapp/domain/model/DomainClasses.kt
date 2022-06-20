package com.example.weatherapp.domain.model

import com.example.weatherapp.data.ResponseClasses

data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<ResponseClasses.Forecast>)

data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)