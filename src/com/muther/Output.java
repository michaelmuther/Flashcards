package com.muther;

public class Output {

    private final String CARD = "Card:";
    private final String DEFINITION = "Definition:";

    public Output(Flashcard f) {
        System.out.println(CARD);
        System.out.println(f.getFront());
        System.out.println(DEFINITION);
        System.out.println(f.getBack());
    }
}
