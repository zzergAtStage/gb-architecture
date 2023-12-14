package com.zergatstage.s06;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.notes.application.ConcreteNoteEditor;
import com.zergatstage.s06.notes.infrastructure.persistance.DatabaseContext;
import com.zergatstage.s06.notes.presentation.queries.controllers.NotesController;
import com.zergatstage.s06.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController notesController = new NotesController(new ConcreteNoteEditor(new NotesConsolePresenter(), new DatabaseContext(new NotesDatabase())));
        notesController.routeGetAll();

    }

}
