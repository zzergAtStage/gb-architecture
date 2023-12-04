package com.zergatstage.hw02.Fabric;

import com.zergatstage.hw02.Model.Client;
import com.zergatstage.hw02.Model.CreditHistory;
import com.zergatstage.hw02.Model.Loan;

import java.util.UUID;

public class EquiFax extends BureauFabric {

    private final String bureauName = "EquiFax";
    private final String messageFormat = "JSON.2.1";

     EquiFax() {
    }

    //business logic
    public String getBureauName() {
        return bureauName;
    }

    public String getMessageFormat() {
        return messageFormat;
    }


    private Client getClientById(UUID clientId) {
        return BureauFabric.clientsMap.get(clientId);
    }
}
