package com.zergatstage.s06.notes.infrastructure.persistance;

import com.zergatstage.s06.database.NotesDatabase;
import com.zergatstage.s06.database.NotesRecord;

import java.util.Collection;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database){
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
        //TODO: Сохранение изменений в базе данных
        Collection<NotesRecord> records = ((NotesDatabase) database).getNotesTable().getRecords();
        for (NotesRecord record : records) {
            ;//do something - like set states, update index etc.
        }

        return true;
    }

}

class ModelBuilder{
    ModelConfiguration configuration;
    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
        this.configuration = configuration;//TODO: добавление конфигурации маппинга объекта некоторого типа к структуре таблицы базы данных ...
        return this;
    }

}
