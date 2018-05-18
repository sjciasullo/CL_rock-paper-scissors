package com.company;

import java.util.Random;

public class Player {
    private String name;
    private String currentMove;
    private int winCount = 0;

    public Player(){
        name = "The Faceless God";
    }

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        winCount = 0;
    }

    public String getCurrentMove(){
        return currentMove;
    }

    // sets currentMove if valid, "rock" if not
    public void setCurrentMove(String move) {
        if(isValidMove(move)){
            currentMove = move;
        } else {
            makeRandomMove();
            System.out.println("Invalid move entered. You have left your choice up to fate. . .");
        }
    }

    // checks to see if move is valid
    private boolean isValidMove(String move){
        if( move == "rock" || move == "paper" || move == "scissors" ){
            return true;
        } else {
            return false;
        }
    }

    public void printWinCount() {
        System.out.println(this.name + ": " + this.winCount);
    }

    public void incrementWins() {
        winCount++;
    }

    // random move for computer and invalid move input
    public void makeRandomMove(){
        Random randGen = new Random();
        final int RANDOM = randGen.nextInt(3);
        final String[] MOVES = {"rock", "paper", "scissors"};
        this.currentMove = MOVES[RANDOM];
    }
}
