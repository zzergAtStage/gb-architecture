package com.zergatstage.s05.persistance;

import com.zergatstage.s05.model.Entity;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();

    Collection<Entity> getAll();

}
