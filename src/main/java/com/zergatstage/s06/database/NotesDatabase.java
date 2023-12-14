package com.zergatstage.s06.database;

import com.zergatstage.s06.notes.infrastructure.persistance.Database;
import lombok.Getter;

@Getter
public class NotesDatabase implements Database {

    private final NotesTable notesTable = new NotesTable();

}
