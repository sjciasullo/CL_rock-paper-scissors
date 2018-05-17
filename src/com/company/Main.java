package com.company;

public class Main {

    public static void main(String[] args) {
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


    }
}
