package com.nssol.sample.naming.ver2;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {
    private List<int[]> gameBoard;
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] dell : gameBoard)
            if (dell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(dell);
        return flaggedCells;
    }
}
