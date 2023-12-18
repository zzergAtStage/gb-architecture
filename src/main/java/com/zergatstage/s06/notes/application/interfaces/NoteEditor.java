package com.zergatstage.s06.notes.application.interfaces;

import com.zergatstage.s06.notes.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
    boolean add(Note note);
}
