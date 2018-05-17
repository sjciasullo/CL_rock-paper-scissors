package com.company;

import java.util.ArrayList;

public class GameState {
    private int numPlayers = 0; // will be 1 or 2
    private ArrayList<String> history;

    public GameState(int numPlayers){
        this.numPlayers = numPlayers;
        history = new ArrayList<>();
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getNumPlayers(){
        return numPlayers;
    }

    public void addHistoryEntry(String entry){
        history.add(entry);
    }

    public void printHistory(){
        for(String entry : history){
            System.out.println(entry);
        }
    }
}