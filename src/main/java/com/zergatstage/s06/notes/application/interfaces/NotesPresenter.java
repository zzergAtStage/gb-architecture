package com.zergatstage.s06.notes.application.interfaces;

import com.zergatstage.s06.notes.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
