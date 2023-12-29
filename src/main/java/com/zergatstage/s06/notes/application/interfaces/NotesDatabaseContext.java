package com.zergatstage.s06.notes.application.interfaces;

import com.zergatstage.s06.notes.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();

}
