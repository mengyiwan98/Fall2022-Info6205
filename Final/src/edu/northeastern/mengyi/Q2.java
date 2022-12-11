package edu.northeastern.mengyi;

//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
// You may assume all four edges of the grid are all surrounded by water.

public class Q2 {
    public int numberIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    sum++;
                    islands(grid, i, j);
                }
            }
        }
        return sum;
    }
    public void islands(char[][] chars, int i, int j) {
        if (chars[i][j] == '0' || chars[i][j] == '2') {
            //water or has been marked
            return;
        }
        if (chars[i][j] == '1') {
            chars[i][j] = '2';
        }
        //bottom
        if ((i + 1) < chars.length) {
            islands(chars,i + 1, j);
        }
        //right
        if ((j + 1) < chars[i].length) {
            islands(chars, i,j + 1);
        }
        //left
        if ((j - 1) >= 0) {
            islands(chars, i,j - 1);
        }
        //top
        if ((i - 1) >= 0) {
            islands(chars,i-1, j);
        }
    }
}
//Time complexity is O(MN)
//Space complexity is O(MN)
