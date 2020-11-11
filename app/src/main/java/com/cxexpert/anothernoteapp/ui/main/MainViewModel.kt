package com.cxexpert.anothernoteapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.cxexpert.anothernoteapp.database.Note
import com.cxexpert.anothernoteapp.repository.NoteRepository

class MainViewModel (application: Application): ViewModel(){
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}