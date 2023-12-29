package com.zergatstage.s06.notes.presentation.queries.views;

import com.zergatstage.s06.notes.application.interfaces.NotesPresenter;
import com.zergatstage.s06.notes.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        System.out.println("Notes in dataBase: ");
        for (Note note: notes) {
            System.out.println(note);
        }
        System.out.println();
    }
}
