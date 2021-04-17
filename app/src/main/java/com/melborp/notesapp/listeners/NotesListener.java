package com.melborp.notesapp.listeners;

import com.melborp.notesapp.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);
}
