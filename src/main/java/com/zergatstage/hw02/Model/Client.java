package com.zergatstage.hw02.Model;

import java.util.UUID;

public class Client {
    private UUID id;
    private final String NAME;

    public Client(String name){
        this.NAME = name;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNAME() {
        return NAME;
    }
}
