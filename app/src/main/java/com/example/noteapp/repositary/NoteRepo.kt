package com.example.noteapp.repositary

import androidx.room.Query
import com.example.noteapp.dataBase.NoteDatebase
import com.example.noteapp.model.Note

class NoteRepo (private val db: NoteDatebase){

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes()= db.getNoteDao().getAllNotes()
    fun searchNote(query: String?)= db.getNoteDao().searchNote(query)
}