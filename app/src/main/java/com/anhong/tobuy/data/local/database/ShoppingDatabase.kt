package com.anhong.tobuy.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anhong.tobuy.data.local.database.dao.CategoryDao
import com.anhong.tobuy.data.local.database.dao.ShoppingItemDao
import com.anhong.tobuy.data.local.database.entities.CategoryEntity
import com.anhong.tobuy.data.local.database.entities.ItemCategoryCrossRef
import com.anhong.tobuy.data.local.database.entities.ShoppingItemEntity

@Database(
    entities = [CategoryEntity::class, ShoppingItemEntity::class, ItemCategoryCrossRef::class],
    version = 1
)
abstract class ShoppingDatabase : RoomDatabase() {
    abstract fun shoppingItemDao(): ShoppingItemDao
    abstract fun categoryDao(): CategoryDao
}