package com.anhong.tobuy.domain.model.composite

import com.anhong.tobuy.domain.model.Category
import com.anhong.tobuy.domain.model.ShoppingItem

data class ItemDetail(
    val item: ShoppingItem,
    val categories: List<Category>
)
