package com.muther;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flashcard> flashcards = new ArrayList<>();
        int numberOfCards = new Input().numberOfCards();
        for (int i = 0; i < numberOfCards; i++) {
            flashcards.add(new Input().createFlashcard());
        }
        for (Flashcard card : flashcards) {
            new Output (card, new Input(card).answer());
        }
    }
}
