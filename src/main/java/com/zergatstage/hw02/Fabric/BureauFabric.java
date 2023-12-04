package com.zergatstage.hw02.Fabric;

import com.zergatstage.hw02.Model.Client;
import com.zergatstage.hw02.Model.CreditHistory;
import com.zergatstage.hw02.Model.Loan;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class BureauFabric implements ObserverBureau{
    //лиш для демонстрации. Не предусмотрено хранилище слиентов
    public static Map<UUID, Client> clientsMap;

    BureauFabric(){
        clientsMap = new HashMap<>();
    }
    public int getClientCreditWorthiness(UUID clientId) {
        Client client = getClientById(clientId);
        return getClientCreditWorthiness(clientId);//асинхронные запросы и т.п.
    }


    public CreditHistory getClientLoansHistory(UUID clientId) {
        Client client = getClientById(clientId);
        return getClientLoansHistory(clientId);
    }


    public void addLoanHistory(Client client, Loan loan) {

    }

    private void updateClientCreditWorthiness(Client client, Loan loan) {
    }

    private Client getClientById(UUID clientId) {
        return clientsMap.get(clientId);
    }

    public CreditHistory getHistoryFromRealBureau(UUID clientId){
        return new CreditHistory();
    }
    public void notifyNewLoan(Client client, Loan loan) {
        System.out.println("Bureau " + this.getClass().getName() + "is notified: " + client.getNAME() + "  ");
    }
}
