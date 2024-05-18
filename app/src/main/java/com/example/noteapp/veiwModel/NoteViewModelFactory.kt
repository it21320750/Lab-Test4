package com.example.noteapp.veiwModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.noteapp.repositary.NoteRepo

class NoteViewModelFactory(val app: Application, private val noteRepo: NoteRepo): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepo) as T
    }
}