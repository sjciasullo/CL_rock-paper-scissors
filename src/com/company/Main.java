package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TESTING AND NECESSARY COMMANDS FOR GAME RUNNING
        /*
        System.out.println("player1's name is: " + player1.getName());
        System.out.println("player2's name is: " + player2.getName());
        player1.setCurrentMove("rock");
        player2.setCurrentMove("asdf");
        player2.setCurrentMove("rOCk"); // false, so handle case sensitivity when it comes in
        player1.incrementWins();
        System.out.println("Score is . . .");
        player1.printWinCount();
        player2.printWinCount();

        GameState gameState = new GameState(1);
        gameState.getNumPlayers();
        gameState.setNumPlayers(2);
        gameState.getNumPlayers();
        gameState.addHistoryEntry("play1 wins play 2 loses");
        gameState.addHistoryEntry("play1 wins play 2 loses");
        gameState.addHistoryEntry("play1 wins play 2 loses");
        gameState.addHistoryEntry("play1 wins play 2 loses");
        gameState.printHistory();

        System.out.println();
        */

        // INITIALIZE PLAYER AND GAMESTATE OBJECTS
        Player player1 = new Player();
        Player player2 = new Player();
        GameState game = new GameState();

        // BEGIN GAME
        runGame(game, player1, player2);


    }

    private static void printWelcome(){
        System.out.println("Welcome to Rock-Paper-Scissors!\n");
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Type 'play' to play");
        System.out.println("2. Type 'history' to view your game history");
        System.out.println("3. Type 'quit' to stop playing\n");
    }

    private static void runGame(GameState game, Player player1, Player player2){
        printWelcome();
        Scanner input = new Scanner(System.in);
        String command = input.next();
        while(!command.equals("quit")){
            // Handle different menu entries
            command = command.toLowerCase();
            switch(command){
                case "history":
                    game.printHistory();
                    break;
                default:
                    System.out.println("-- Command not recognized. Returning to menu.\n\n");
                    break;
            }
            System.out.println("~~~~~~~~~\n");
            printWelcome();
            command = input.next();
        }
        input.close();
    }
}