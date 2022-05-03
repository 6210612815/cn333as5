package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_friend") val isFriend: Boolean,

    ) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Bank", "0988928830", false, false, 1, false,false),
            ContactDbModel(2, "Tharam", "0811457785", false, false, 2, false,false),
            ContactDbModel(3, "Mc", "0625521444", false, false, 3, false,false),
            ContactDbModel(4, "Parin", "0215469985", false, false, 4, false, false),
            ContactDbModel(5, "Mek", "0985624458", false, false, 5, false,false),

            )
    }
}
