package com.example.androidpractice.funfact;

import java.util.Random;

/**
 * Created by 205796 on 6/17/15.
 */
public class FactBook {

    //Member variables (properties about the object)
   public String [] mFacts= {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not really in a tree."
    };

    public String getFact(){

 

        String fact = "";

        //Randomly select a fact
        Random randomGenerator= new Random(); // Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

                /* Convert the randomNumber into a text fact
                 * 0 = Ants Stretch when e=they wake up in the morning
                 * 1 = Ostriches can run faster than horses
                 * 2 = olympic gold medal are actually made mostly of silver
                 */

        fact = mFacts[randomNumber];

        return fact;
    }
}
