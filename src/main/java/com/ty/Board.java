package com.ty;

import java.util.*;

// Class to represent the game board
public class Board {
    private char[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean placeMark(int row, int col, char mark) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == ' ') {
            board[row][col] = mark;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public boolean checkWin(char mark) {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            if (checkRow(i, mark) || checkCol(i, mark)) return true;
        }
        // Check diagonals
        return checkDiagonal(mark) || checkAntiDiagonal(mark);
    }

    private boolean checkRow(int row, char mark) {
        for (int j = 0; j < size; j++) {
            if (board[row][j] != mark) return false;
        }
        return true;
    }

    private boolean checkCol(int col, char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][col] != mark) return false;
        }
        return true;
    }

    private boolean checkDiagonal(char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][i] != mark) return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(char mark) {
        for (int i = 0; i < size; i++) {
            if (board[i][size - i - 1] != mark) return false;
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j < size - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < size - 1) System.out.println("--+---+--");
        }
    }
}

