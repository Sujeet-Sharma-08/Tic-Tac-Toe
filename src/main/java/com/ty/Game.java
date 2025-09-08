package com.ty;

public class Game {
    private Board board;
    private Player player1, player2;

    public Game(Player p1, Player p2) {
        this.board = new Board(3);
        this.player1 = p1;
        this.player2 = p2;
    }

    public void start() {
        Player current = player1;
        while (true) {
            board.printBoard();
            current.makeMove(board);

            if (board.checkWin(current.getMark())) {
                board.printBoard();
                System.out.println(current.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch turn
            current = (current == player1) ? player2 : player1;
        }
    }
}
