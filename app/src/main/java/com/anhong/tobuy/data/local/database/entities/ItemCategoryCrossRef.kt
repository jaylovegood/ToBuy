package com.anhong.tobuy.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName = "item_category_cross_ref",
    primaryKeys = ["item_id", "category_id"],
    foreignKeys = [
        ForeignKey(
            entity = ShoppingItemEntity::class,
            parentColumns = ["id"],
            childColumns = ["item_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["id"],
            childColumns = ["category_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ItemCategoryCrossRef (
    @ColumnInfo(name = "item_id")
    val itemId: Long,
    @ColumnInfo(name = "category_id")
    val categoryId: Long
)