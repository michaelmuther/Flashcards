package com.muther;

import java.util.Scanner;

public class Input {
    Scanner s = new Scanner(System.in);
    Flashcard flashcard;
    static int cardNumber = 0;

    public Input() {
    }

    public Input(Flashcard flashcard) {
        this.flashcard = flashcard;
    }

    public int numberOfCards() {
        System.out.println("Input the number of cards:");
        return s.nextInt();
    }

    public Flashcard createFlashcard() {
        cardNumber++;
        System.out.println("Card #" + cardNumber);
        String termTemp = s.nextLine();
        System.out.println("The definition for card #" + cardNumber);
        String definitionTemp = s.nextLine();
        Flashcard tempFlashCard = new Flashcard(termTemp, definitionTemp);
        return tempFlashCard;
    }

    public String answer() {
        System.out.println("Print the definition of \"" + flashcard.getTerm() + "\":");
        return s.nextLine();
    }
}
