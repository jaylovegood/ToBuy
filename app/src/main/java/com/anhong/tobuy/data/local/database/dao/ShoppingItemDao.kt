package com.anhong.tobuy.data.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.anhong.tobuy.data.local.database.entities.ItemCategoryCrossRef
import com.anhong.tobuy.data.local.database.entities.ShoppingItemEntity
import com.anhong.tobuy.data.local.database.relations.ItemWithCategories
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingItemDao {
    @Insert
    suspend fun insertShoppingItem(item: ShoppingItemEntity)

    @Delete
    suspend fun deleteShoppingItem(item: ShoppingItemEntity)

    @Update
    suspend fun updateShoppingItem(item: ShoppingItemEntity)

    @Insert
    suspend fun addItemToCategory(crossRef: ItemCategoryCrossRef)

    @Transaction
    @Query("SELECT * FROM shopping_items")
    fun getItemsWithCategories(): Flow<List<ItemWithCategories>>
}