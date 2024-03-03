package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.DeckCardGenerator;

public class Main {

    public static void main(String[] args) {
        DeckCardGenerator deckCardGenerator = new DeckCardGenerator();
        System.out.println(deckCardGenerator.getDeck());
    }
}