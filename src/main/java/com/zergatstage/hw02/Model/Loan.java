package com.zergatstage.hw02.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Loan {
    private long loanId;
    private static int counter;
    protected LoanType loanType;
    protected List<LoanRecord> loanRecords;
    Loan(){
        loanId = ++counter;
        loanRecords = new ArrayList<>();
    }
    public long getLoanId(){
        return  this.loanId;
    }
}
