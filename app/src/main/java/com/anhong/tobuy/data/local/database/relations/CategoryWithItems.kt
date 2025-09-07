package com.anhong.tobuy.data.local.database.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.anhong.tobuy.data.local.database.entities.CategoryEntity
import com.anhong.tobuy.data.local.database.entities.ItemCategoryCrossRef
import com.anhong.tobuy.data.local.database.entities.ShoppingItemEntity

data class CategoryWithItems (
    @Embedded
    val category: CategoryEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            value = ItemCategoryCrossRef::class,
            parentColumn = "category_id",
            entityColumn = "item_id"
        )
    )
    val items: List<ShoppingItemEntity>
)