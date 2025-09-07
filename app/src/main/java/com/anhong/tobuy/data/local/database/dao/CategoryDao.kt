package com.anhong.tobuy.data.local.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.anhong.tobuy.data.local.database.entities.CategoryEntity
import com.anhong.tobuy.data.local.database.relations.CategoryWithItems
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {
    @Insert
    suspend fun insertCategory(category: CategoryEntity)

    @Delete
    suspend fun deleteCategory(category: CategoryEntity)

    @Query("SELECT * FROM categories")
    fun getAllCategories(): Flow<List<CategoryEntity>>

    @Transaction
    @Query("SELECT * FROM categories")
    fun getCategoriesWithItems(): Flow<List<CategoryWithItems>>
}
