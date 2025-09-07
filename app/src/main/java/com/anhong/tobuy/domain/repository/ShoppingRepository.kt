package com.anhong.tobuy.domain.repository;

import com.anhong.tobuy.domain.model.Category
import com.anhong.tobuy.domain.model.ShoppingItem
import com.anhong.tobuy.domain.model.composite.CategoryListing
import com.anhong.tobuy.domain.model.composite.ItemDetail
import kotlinx.coroutines.flow.Flow

interface ShoppingRepository {
    fun getCategoriesStream(): Flow<List<CategoryListing>>
    fun getItemsStream(): Flow<List<ItemDetail>>

    suspend fun createCategory(category: Category): Int?
    suspend fun updateCategory(category: Category): Int?
    suspend fun deleteCategory(category: Category): Int?

    suspend fun createItem(item: ShoppingItem)
    suspend fun updateItem(item: ShoppingItem)
    suspend fun deleteItem(item: ShoppingItem)
    suspend fun addItemToCategories(item: ShoppingItem, categories: List<Category>)
    suspend fun removeItemFromCategory(item: ShoppingItem, category: Category)
}