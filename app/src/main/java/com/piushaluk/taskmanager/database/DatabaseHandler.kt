package com.piushaluk.taskmanager.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.piushaluk.taskmanager.models.NoteItem


@Database(entities = [NoteItem::class], version = 1)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun noteDao(): NotesDao

    companion object {
        fun provideDB(
            context: Context
        ) = Room.databaseBuilder(
            context,
            NotesDatabase::class.java,
            "notes"
        ).build()
    }
}