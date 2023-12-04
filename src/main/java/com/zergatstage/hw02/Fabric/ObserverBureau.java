package com.zergatstage.hw02.Fabric;

import com.zergatstage.hw02.Model.Client;
import com.zergatstage.hw02.Model.Loan;

public interface ObserverBureau {
    void notifyNewLoan(Client client, Loan loan);
}
