package com.muther;

public class Output {

    public Output(Flashcard card, String answer) {
        final String CORRECT = "Correct!";
        final String WRONG = "Wrong. The right answer is \"%s\".\n";
        if (card.getDefinition().equals(answer)) {
            System.out.println(CORRECT);
        } else {
            System.out.printf(WRONG, card.getDefinition());
        }
    }
}
