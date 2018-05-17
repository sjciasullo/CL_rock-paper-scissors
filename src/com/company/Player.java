package com.company;

public class Player {
    private String name;
    private String currentMove;
    private int winCount = 0;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentMove(){
        return currentMove;
    }

    // sets currentMove if valid, "rock" if not
    public void setCurrentMove(String move) {
        if(isValidMove(move)){
            currentMove = move;
        } else {
            currentMove = "rock";
            System.out.println("Invalid move. Your move was set to default.");
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
}
