package com.zergatstage.s04.task2;

public class CustomerProvider {

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    /**
     * Method provides new customer entity by authorized user
     * @param login User login, not null
     * @param password User password, not null
     * @return Customer class entity
     */
    public Customer getCustomer(String login, String password){
        if (login.isBlank() || password.isBlank())
            throw new IllegalArgumentException("user login or password cannot be empty");
        //Процесс аутентификации
        Customer currentCustomer = database.getCustomerByLogin(login,password.hashCode());
        return (currentCustomer != null) ? currentCustomer : new Customer(login, password.hashCode());
    }


}
