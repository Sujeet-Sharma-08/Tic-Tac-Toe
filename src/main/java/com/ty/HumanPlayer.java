package com.ty;
import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name, char mark) {
        super(name, mark);
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        while (true) {
            System.out.print(name + " (" + mark + "), enter row and column (0,1,2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.placeMark(row, col, mark)) break;
            else System.out.println("Invalid move! Try again.");
        }
    }
}