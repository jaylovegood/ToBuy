package com.anhong.tobuy.data.local.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import androidx.room.Junction
import com.anhong.tobuy.data.local.database.entities.CategoryEntity
import com.anhong.tobuy.data.local.database.entities.ItemCategoryCrossRef
import com.anhong.tobuy.data.local.database.entities.ShoppingItemEntity

data class ItemWithCategories (
    @Embedded
    val item: ShoppingItemEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            value = ItemCategoryCrossRef::class,
            parentColumn = "item_id",
            entityColumn = "category_id"
        )
    )
    val categories: List<CategoryEntity>
)