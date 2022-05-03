package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#E0BBE4","Mobile"),
            TagDbModel(2, "#957DAD","Home"),
            TagDbModel(3, "#D291BC","Work"),
            TagDbModel(4, "#FEC8D8","University"),
            TagDbModel(5, "#FFDFD3","Emergency"),
            )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
