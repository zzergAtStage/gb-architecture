package com.zergatstage.s06.notes.infrastructure.persistance;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.database.NotesRecord;
import com.zergatstage.s06.notes.application.interfaces.NotesDatabaseContext;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.infrastructure.persistance.configuration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {


    public DatabaseContext(Database database) {
        super(database);
    }

    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
