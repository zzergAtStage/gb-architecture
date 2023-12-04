package com.zergatstage.hw02.Model;

public class Overdraft extends Loan{


    public Overdraft(){
        super();
        this.loanType = LoanType.CREDIT_CARD;
    }
    @Override
    public long getLoanId() {
        return (int) super.getLoanId() / 10;
    }
}
