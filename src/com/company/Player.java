package com.company;

public class Player {
    private String name;
    private String currentMove;

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

    public void setCurrentMove(String move) {
        if(isValidMove(move)){
            currentMove = move;
        } else {
            currentMove = "rock";
            System.out.println("Invalid move. Your move was set to default.");
        }
    }

    // checks to see if moves
    private boolean isValidMove(String move){
        if( move == "rock" || move == "paper" || move == "scissors" ){
            return true;
        } else {
            return false;
        }
    }

}
