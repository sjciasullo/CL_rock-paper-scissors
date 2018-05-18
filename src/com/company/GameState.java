package com.company;

import java.util.ArrayList;

public class GameState {
    private int numPlayers = 0; // will be 1 or 2
    private ArrayList<String> history;

    public GameState(){
        history = new ArrayList<>();
    }

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
        if(history.isEmpty()){
            System.out.println("No History yet! Get playing, player!");
        } else {
            for(String entry : history){
                System.out.println(entry);
            }
        }
    }
}