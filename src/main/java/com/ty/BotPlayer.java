package com.ty;

import java.util.Random;

// Bot player (simple AI: random move)
public class BotPlayer extends Player {

    private Random random = new Random();

    public BotPlayer(String name, char mark) {
        super(name, mark);
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        System.out.println(name + " (" + mark + ") is making a move...");
        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);
            if (board.placeMark(row, col, mark)) break;
        }
    }
}

