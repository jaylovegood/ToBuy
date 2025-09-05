package com.anhong.tobuy.data.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Update
import androidx.room.Query
import com.anhong.tobuy.data.local.database.entities.ShoppingItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingItemDao {
    @Insert
    suspend fun insertShoppingItem(item: ShoppingItemEntity)

    @Delete
    suspend fun deleteShoppingItem(item: ShoppingItemEntity)

    @Update
    suspend fun updateShoppingItem(item: ShoppingItemEntity)

    @Query(
        "SELECT * FROM shopping_items " +
                "WHERE category_id = :categoryId " +
                "ORDER BY id ASC"
    )
    fun getItemsInCategory(categoryId: Long): Flow<List<ShoppingItemEntity>>
}