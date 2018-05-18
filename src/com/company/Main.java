package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

    private static void printMoveInstructions(String playerName){
        System.out.println("Type in 'rock' 'paper' or 'scissors' to play\nType 'quit' to return to Main Menu");
        System.out.print(playerName + " picks: ");
    }

    //returns 0 if tie, 1 if player 1 wins, 2 if player 2 wins
    private static int winDecider(String playerOneMove, String playerTwoMove){
        HashMap<String, String> winningCombos = new HashMap<>();
        winningCombos.put("rock", "scissors");
        winningCombos.put("scissors", "paper");
        winningCombos.put("paper", "rock");

        if((winningCombos.get(playerOneMove)).equals(playerTwoMove)){
            return 1;
        } else if((winningCombos.get(playerTwoMove)).equals(playerOneMove)){
            return 2;
        } else {
            return 0;
        }
    }

    private static void printScore(Player player1, Player player2){
        System.out.println("\n-- Scoreboard --");
        player1.printWinCount();
        player2.printWinCount();
    }

    private static void runGame(GameState game, Player player1, Player player2){
        printWelcome();
        Scanner input = new Scanner(System.in);
        String command = input.next();

        while(!command.equals("quit")){
            // Handle different menu entries
            command = command.toLowerCase();
            switch(command){
                case "play":
                    System.out.println("\n");
                    System.out.println("Please enter '1player' or '2player'");
                    String mode = input.next();
                    boolean nextStep = false;
                    while(!nextStep){
                        if(mode.equals("1player") || mode.equals("2player")){
                            // Prompt for name
                            // player's score resets if name is different
                            System.out.print("Enter Player 1's name: ");
                            player1.setName(input.next());
                            System.out.println("\n");

                            if(mode.equals("2player")){
                                // Prompt for player2's name
                                System.out.print("Enter Player 2's name: ");
                                player2.setName(input.next());
                                System.out.println("\n");
                            }

                            // Get player's move
                            printMoveInstructions(player1.getName());
                            String playerMove = input.next();
                            if(playerMove.equals("quit")){
                                break;
                            } else {
                                player1.setCurrentMove(playerMove);
                            }

                            // if 2 player mode then get player 2's move
                            if(mode.equals("2player")){
                                printMoveInstructions(player2.getName());
                                playerMove = input.next();
                                if(playerMove.equals("quit")){
                                    break;
                                } else {
                                    player2.setCurrentMove(playerMove);
                                }
                            } else {
                                // make random move for player2
                                System.out.println(player2.getName() + " picks: " + player2.makeRandomMove());
                            }

                            // decide who wins
                            int winnerCode = winDecider(player1.getCurrentMove(), player2.getCurrentMove());
                            if(winnerCode == 0){
                                System.out.println("The result is a tie! Please play again!");
                                game.addHistoryEntry(player1.getName() + " ties " + player2.getName() + " with " + playerMove);
                            } else if(winnerCode == 1){
                                System.out.println(player1.getName() + " is the winner!");
                                player1.incrementWins();
                                game.addHistoryEntry(player1.getName() + " wins with " + player1.getCurrentMove() + " against " +
                                                     player2.getName() + "'s " + player2.getCurrentMove());
                            } else {
                                System.out.println(player2.getName() + " is the winner!");
                                player2.incrementWins();
                                game.addHistoryEntry(player2.getName() + " wins with " + player2.getCurrentMove() + " against " +
                                        player1.getName() + "'s " + player1.getCurrentMove());
                            }
                            printScore(player1, player2);

                            //advances to next game
                            nextStep = true;
                        } else {
                            System.out.println("Invalid mode entry. Please try again. '1player' or '2player'");
                            mode = input.next();
                        }
                    }
                    break;
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