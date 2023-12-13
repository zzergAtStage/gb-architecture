package com.zergatstage.s04.task2;

public class CustomerProvider {

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password){
        if (login.isBlank() || password.isBlank())
            throw new IllegalArgumentException("user login or passord cannot be empty");
        //TODO: Процесс аутентификации
        return new Customer();
    }


}
