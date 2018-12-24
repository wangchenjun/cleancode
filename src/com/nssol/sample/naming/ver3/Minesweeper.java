package com.nssol.sample.naming.ver3;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {
    private List<Cell> gameBoard;

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
