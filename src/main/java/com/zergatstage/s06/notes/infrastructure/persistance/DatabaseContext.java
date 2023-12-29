package com.zergatstage.s06.notes.infrastructure.persistance;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.database.NotesRecord;
import com.zergatstage.s06.notes.application.interfaces.NoteEditor;
import com.zergatstage.s06.notes.application.interfaces.NotesDatabaseContext;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.infrastructure.persistance.configuration.NoteConfiguration;
import lombok.Getter;

import java.util.*;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {


    private ModelBuilder modelBuilder;


    public DatabaseContext(Database database) {
        super(database);
        this.modelBuilder = new ModelBuilder();
        this.onModelCreating(modelBuilder);
    }

    public Collection<Note> getAll() {
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        Collection<Note> notesList = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
//            ((NoteConfiguration) modelBuilder.configuration).transform(note);
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
        modelBuilder = builder.applyConfiguration(new NoteConfiguration());
    }
    public Database getDatabase() {
        return this.database;
    }


    @Override
    public boolean saveChanges() {
        //drop all notes in db
        //((NotesDatabase)database).getNotesTable().getRecords().clear();
//        for (Note note : notesList) {
//            NotesRecord record = ((NoteConfiguration)modelBuilder.configuration).transform(note);
//            ((NotesDatabase) database).getNotesTable().addRecord(record);
//        }
        return super.saveChanges();
    }

}
