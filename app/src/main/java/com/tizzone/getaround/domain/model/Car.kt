package com.tizzone.getaround.domain.model

data class Car(
    val id: String,
    val owner: Owner,
    val rating: Rating?,
    val model: String,
    val pricePerDay: Int,
    val brand: String,
    val precio: String,
    val anio: String,
    val km: String,
    val motor: String,
    val garantia: String
)
