package com.cxexpert.anothernoteapp.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.cxexpert.anothernoteapp.database.Note
import com.cxexpert.anothernoteapp.repository.NoteRepository

class NoteAddUpdateViewModel (application: Application): ViewModel(){
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    fun insert(note: Note){
        mNoteRepository.insert(note)
    }
    fun update(note: Note){
        mNoteRepository.update(note)
    }
    fun delete(note: Note){
        mNoteRepository.delete(note)
    }
}