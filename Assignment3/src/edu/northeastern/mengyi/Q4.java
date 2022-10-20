package edu.northeastern.mengyi;

public class Q4 {
    private boolean find;
    public boolean exist(char[][] board, String word) {
        find = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtracking(i, j, board, word, 0);
            }
        }
        return find;
    }
    public void backtracking(int i, int j, char[][] board, String word, int index) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                board[i][j] == '.' || board[i][j] != word.charAt(index)) {
            return;
        }
        if(index == word.length() - 1) {
            find = true;
            return;
        }
        char temp = board[i][j];
        board[i][j] = '.';
        backtracking(i + 1, j, board, word, index + 1);
        backtracking(i - 1, j, board, word, index + 1);
        backtracking(i, j + 1, board, word, index + 1);
        backtracking(i, j - 1, board, word, index + 1);
        board[i][j] = temp;
    }
}
