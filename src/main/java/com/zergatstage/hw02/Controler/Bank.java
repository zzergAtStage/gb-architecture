package com.zergatstage.hw02.Controler;

import com.zergatstage.hw02.Fabric.*;
import com.zergatstage.hw02.Model.Client;
import com.zergatstage.hw02.Model.Loan;

import java.util.HashMap;
import java.util.Map;

public class Bank{
    ConcreteBureauFabric fabric;
    CommunicationService commService;
    public static Map<Long,Loan> loans;
    public void init(){
        fabric =  ConcreteBureauFabric.getInstance();
        BureauFabric bureau1 = getConcreteBureauFabric(EquiFax.class);
        BureauFabric bureau2 = getConcreteBureauFabric(TransUnion.class);
        commService = new CommunicationService();
        commService.addObserver(bureau1);
        commService.addObserver(bureau2);
        loans = new HashMap<>();
    }
    public void applyNewLoan(Client client, Loan loan){
        loans.put(loan.getLoanId(), loan);
        for (ObserverBureau observer :
                commService.getObservers()) {
            observer.notifyNewLoan(client, loan);
        }
    }

    private BureauFabric getConcreteBureauFabric(Class<? extends BureauFabric> equiFaxClass) {
        return fabric.getBureau(equiFaxClass);
    }
}
