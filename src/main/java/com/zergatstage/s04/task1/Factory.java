package com.zergatstage.s04.task1;

/**
 * Фабрика
 */
public interface Factory {

    /**
     * Метод получения информации о детали
     * @param id идентификатор детали
     * @return информация о детали
     */
    ComponentInfo getComponentInfo(int id);

}
