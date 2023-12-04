package com.zergatstage.hw02.Model;

import java.util.List;

public class LoanRecord {
    private long loanId;
    private List<String> records;

    LoanRecord(long loanId){
        this.loanId = loanId;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }
    public void addRecord(String record){
        this.records.add(record);
    }
}
