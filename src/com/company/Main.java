package com.company;

public class Main {

    public static void main(String[] args) {
        // TESTING AND NECESSARY COMMANDS FOR GAME RUNNING
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Computer");
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

        // WILL GO IN WHILE LOOP UNTIL INPUT MESSAGE IS "quit"
        printWelcome();

    }

    private static void printWelcome(){
        System.out.println("Welcome to Rock-Paper-Scissors!\n");
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Type 'play' to play");
        System.out.println("2. Type 'history' to view your game history");
        System.out.println("3. Type 'quit' to stop playing");
    }
}