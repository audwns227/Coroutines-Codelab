package com.example.coroutinescodelab

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.system.measureTimeMillis

//fun main() {
//    val time = measureTimeMillis {
//        runBlocking {
//            println("Weather forecast")
////            val forecast: Deferred<String> = async {
////                getForecast()
////            }
////            val temperature: Deferred<String> = async {
////                getTemperature()
////            }
//            println(getWeatherReport())
//            println("Have a good day!")
//        }
//    }
//    println("Execution Time : ${time / 1000.0} seconds")
//}
//
//suspend fun getForecast(): String {
//    delay(1000)
//    return "Sunny"
//}
//
//suspend fun getTemperature(): String {
//    delay(1000)
//    return "30\u00b0C"
//}
//
//suspend fun getWeatherReport() = coroutineScope {
//    val forecast = async { getForecast() }
//    val temperature = async { getTemperature() }
//    "${forecast.await()} ${temperature.await()}"
//}

fun main() {
    runBlocking {
        println("${Thread.currentThread().name} - runBlocking function")
        launch {
            println("${Thread.currentThread().name} - launch function")
            withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name} - withContext function")
                delay(2000)
                println("10 results found.")
            }
            println("${Thread.currentThread().name} - end of launch function")
        }
        println("Loading...")
    }
}