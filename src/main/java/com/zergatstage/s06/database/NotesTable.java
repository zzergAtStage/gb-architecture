package com.zergatstage.s06.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private final Random random = new Random();
    private Collection<NotesRecord> records;

    public Collection<NotesRecord> getRecords() {
        prepareRecords();
        return records;
    }

    public void addRecord(NotesRecord record){
        records.add(record);
    }
    private void prepareRecords() {
        if (records == null) {
            records = new ArrayList<>();
            int recordsCount = 5 + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++) {
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
    }
    public boolean updateRecord(NotesRecord record) {
        for (NotesRecord rec : records) {
            if (rec.getId() == record.getId()) {
                rec.setTitle(record.getTitle());
                rec.setDetails(record.getDetails());
                return true;
            }
        }
        return false;
    }


}
