package com.example.todolist.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.sql.Time
import java.util.*

@Entity(tableName = "taskInfo")
data class TaskInfo(
    @PrimaryKey(autoGenerate = false)
    //Semua data tentang task user disimpan di sini.
    var id : Int,
    var description : String,
    var date : Date,
    var priority : Int,
    var status : Boolean,
    var category: String
) : Serializable

