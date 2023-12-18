package com.zergatstage.s06.database;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class NotesRecord {

    @Getter
    private static int counter;

    private int userId;
    private int id;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;
    //default creation method
    {
        id = ++counter;
        userId = 20001;
    }

    public NotesRecord(String title, String details){
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

}
