package com.nssol.sample.naming.ver3;

public class Cell {
    private int[] cell;

    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    public boolean isFlagged() {
        return this.cell[STATUS_VALUE] == FLAGGED;
    }
}
