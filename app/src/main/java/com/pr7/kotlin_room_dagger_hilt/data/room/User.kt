package com.pr7.kotlin_room_dagger_hilt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pr7.kotlin_room_dagger_hilt.Constants.TABLE_NAMEE


@Entity(tableName = TABLE_NAMEE)
class User constructor(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val uid:Int,
    @ColumnInfo(name = "name")
    val name:String
)