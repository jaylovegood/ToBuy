package com.anhong.tobuy.domain.model.composite

import com.anhong.tobuy.domain.model.Category
import com.anhong.tobuy.domain.model.ShoppingItem

data class CategoryListing(
    val category: Category,
    val items: List<ShoppingItem>
)
