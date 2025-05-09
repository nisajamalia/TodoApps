package com.example.todolist.data.model

import androidx.room.Embedded
import androidx.room.Relation
import java.io.Serializable

// ini buat model data yang menggabungkan tugas (TaskInfo) dengan kategori-kategori yang berhubungan.
data class TaskCategoryInfo(

    @Embedded val taskInfo: TaskInfo,
    @Relation(
        parentColumn = "category",
        entityColumn = "categoryInformation"
    )
    val categoryInfo: List<CategoryInfo>
) : Serializable
