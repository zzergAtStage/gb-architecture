package com.zergatstage.s02;

public class OperationSystemLogEventsReader extends LogReader{
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) throws Exception {

    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
