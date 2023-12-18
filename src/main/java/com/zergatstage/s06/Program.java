package com.zergatstage.s06;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.database.NotesRecord;
import com.zergatstage.s06.notes.application.ConcreteNoteEditor;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.infrastructure.persistance.DatabaseContext;
import com.zergatstage.s06.notes.presentation.queries.controllers.NotesController;
import com.zergatstage.s06.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        int newUserId = 20002;
        NotesController notesController = new NotesController(new ConcreteNoteEditor
                (new NotesConsolePresenter(),
                        new DatabaseContext(new NotesDatabase())));
        notesController.routeGetAll();

        //get NotesId counter
        int currNoteId = NotesRecord.getCounter();
        Note note1 = new Note(currNoteId,newUserId,"First init", "This note should be first after the init block", new Date());
        notesController.routeAddNote(note1);
        notesController.routeGetAll();

    }

}
