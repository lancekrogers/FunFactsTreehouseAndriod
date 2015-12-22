package com.lancekrogers.funfacts;

import java.util.Random;

/**
 * Created by lancerogers on 12/22/15.
 */
public class FactBook {

    /*
    Method Variables
    Abilitities
    */
    public String getFact() {
        String[] facts = {
                "Picasso cut off his ear",
                "Money makes the world go around",
                "Boats are cool",
                "There truly is nothing like monkey love",
                "The moon is in Space",
                "I need a developer job",
                "Guinea pigs and Humans can't make vitamin C",
                "I need a developer job",
                "Steve Jobs started apple",
                "Kayaking is fun",
                "Being happy is good for everyone"

        };

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randInteger = randomGenerator.nextInt(facts.length);

        fact = facts[randInteger];

        return fact;
    }


}
