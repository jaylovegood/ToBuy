package com.anhong.tobuy.domain.model

data class ShoppingItem (
    val id: Long,
    val name: String = "",
    val price: Int = 0,
    val description: String = "",
    val bought: Boolean = false,
) {

}