package com.ty;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player human = new HumanPlayer(name, 'X');
        Player bot = new BotPlayer("Computer", 'O');

        Game game = new Game(human, bot);
        game.start();
    }
}

