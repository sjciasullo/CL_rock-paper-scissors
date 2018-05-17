package com.company;

public class GameState {
    private int numPlayers = 0; // will be 1 or 2

    public GameState(int numPlayers){
        this.numPlayers = numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getNumPlayers(){
        return numPlayers;
    }
}