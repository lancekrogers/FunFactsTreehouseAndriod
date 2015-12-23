package com.lancekrogers.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by lancerogers on 12/22/15.
 */
public class ColorWheel {

    /*
    Method Variables
    Abilitities
    */
    public int getColor() {
        String[] mColors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray

        };

        String color = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randInteger = randomGenerator.nextInt(mColors.length);

        color = mColors[randInteger];

        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }


}