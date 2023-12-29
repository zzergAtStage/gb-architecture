package com.zergatstage.s06.notes.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
public class Note {

    @Setter
    private int userId;
    private final int id;
    @Setter
    private String title;
    @Setter
    private String details;
    private final Date creationDate;
    @Setter
    private Date editDate;


    public Note(int id, int userId, String title, String details, Date creationDate) {
        this.id = id;//possible? there is a bug? Constructor doesn't use counter
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "Note{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", creationDate=" + creationDate +
                ", editDate=" + editDate +
                '}';
    }
}
