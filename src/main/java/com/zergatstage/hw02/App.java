package com.zergatstage.hw02;

import com.zergatstage.hw02.Controler.Bank;
import com.zergatstage.hw02.Model.Client;
import com.zergatstage.hw02.Model.Loan;
import com.zergatstage.hw02.Model.Overdraft;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client("John");
        Client client2 = new Client("Maria");

        Bank bank1 = new Bank();
        bank1.init();
        Loan loan1 = new Overdraft();
        Loan loan2 = new Overdraft();
        bank1.applyNewLoan(client1, loan1);
        bank1.applyNewLoan(client2, loan2);
        for (Map.Entry loan: Bank.loans.entrySet()
             ) {
            System.out.println(loan.getKey());
        }

    }
}
