package com.zergatstage.s06.notes.presentation.queries.controllers;

import com.zergatstage.s06.notes.application.interfaces.NoteEditor;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.presentation.queries.controllers.Controller;

public class NotesController extends Controller {


    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public void routeGetAll(){
        notesEditor.printAll();
    }


}
