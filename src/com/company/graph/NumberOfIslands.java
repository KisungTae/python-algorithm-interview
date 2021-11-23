package com.company.graph;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {

        int num = 0;

        for (int i = 0; i < grid.length; i++) {
            char[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                char col = row[j];
                if (col == '1') {
                    num++;
                    makeZero(grid, i, j);
                }
            }
        }

        return num;
    }

    private void makeZero(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return;

        char curr = grid[row][col];

        if (curr != '1') return;

        grid[row][col] = 0;

        makeZero(grid, row + 1, col);
        makeZero(grid, row - 1, col);
        makeZero(grid, row, col + 1);
        makeZero(grid, row, col - 1);
    }
}
