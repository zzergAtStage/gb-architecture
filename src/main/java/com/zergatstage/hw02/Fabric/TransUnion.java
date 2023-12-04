package com.zergatstage.hw02.Fabric;

import com.zergatstage.hw02.Model.CreditHistory;

import java.util.UUID;

public class TransUnion extends BureauFabric {

    private final String bureauName = "TransUnion";

    public String getProtocolVersion() {
        return protocolVersion;
    }

    private final String protocolVersion = "#00B23";

    public String getBureauName(){
        return bureauName;
    }

    @Override
    public CreditHistory getClientLoansHistory(UUID clientId) {
        System.out.println("Some custom call from one of the fabric object " + TransUnion.class.getName());
        return super.getClientLoansHistory(clientId);
    }
}
