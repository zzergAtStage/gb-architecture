package com.zergatstage.s06.notes.infrastructure.persistance.configuration;

import com.zergatstage.s06.database.NotesRecord;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.infrastructure.persistance.ModelConfiguration;

public class NoteConfiguration implements ModelConfiguration<Note> {
    public NotesRecord transform(Note note) {
        NotesRecord notesRecord = new NotesRecord(note.getTitle(), note.getDetails());
        notesRecord.setId(note.getId());
        notesRecord.setCreationDate(note.getCreationDate());
        notesRecord.setEditDate(note.getEditDate());
        return notesRecord;
    }


}
