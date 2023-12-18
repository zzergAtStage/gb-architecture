package com.zergatstage.s06.notes.application;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.database.NotesRecord;
import com.zergatstage.s06.notes.application.interfaces.NoteEditor;
import com.zergatstage.s06.notes.application.interfaces.NotesDatabaseContext;
import com.zergatstage.s06.notes.application.interfaces.NotesPresenter;
import com.zergatstage.s06.notes.domain.Note;
import com.zergatstage.s06.notes.infrastructure.persistance.DatabaseContext;
import com.zergatstage.s06.notes.infrastructure.persistance.DbContext;
import com.zergatstage.s06.notes.infrastructure.persistance.ModelConfiguration;
import com.zergatstage.s06.notes.infrastructure.persistance.configuration.NoteConfiguration;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;


    public ConcreteNoteEditor(
            NotesPresenter notesPresenter,
            NotesDatabaseContext dbContext){
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;

    }

    public void printAll(){
        notesPresenter.printAll(getAll());
    }

    @Override
    public boolean add(Note item) {
        //dbContext.getAll().add(item);//There is no adding item in the real case?
        NotesRecord record = new NotesRecord(item.getTitle(), item.getDetails());
        ((NotesDatabase)((DatabaseContext) dbContext).getDatabase()).getNotesTable().addRecord(record);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        if (item == null)
            return false;
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty())
            return false;
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        note.get().setUserId(item.getUserId());

        return dbContext.saveChanges();
    }

    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer integer) {
        return dbContext.getAll().stream().filter(p -> p.getId() == integer).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }


}
