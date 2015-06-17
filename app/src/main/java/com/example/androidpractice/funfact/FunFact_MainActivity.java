package com.example.androidpractice.funfact;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFact_MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact__main);

        //Declare our View variables and assign the Views from the layout file

        final TextView factLabel = (TextView) findViewById(R.id.FactTextView);
        Button showFactButton= (Button) findViewById(R.id.showFact_button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //array for storing facts
                String [] facts= {
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

                // The Button was clicked, so update the fact label with new fact
                String fact = "";
                //Randomly select a fact
                Random randomGenerator= new Random(); // Construct a new random number generator
                int randomNumber = randomGenerator.nextInt(facts.length);

                /* Convert the randomNumber into a text fact
                 * 0 = Ants Stretch when e=they wake up in the morning
                 * 1 = Ostriches can run faster than horses
                 * 2 = olympic gold medal are actually made mostly of silver
                 */

                //if randomNumber is equal to 0 then
                if(randomNumber == 0){
                    //set fact equal to ant fact
                    fact = "Ants Stretch when they wake up in the morning";
                }
                //if randomNumber is equal to 1 then
                else if(randomNumber == 1){
                    //set fact equal to ostriches fact
                    fact = "Ostriches can run faster than horses";
                }
                //if randomNumber is equal to 2 then
                else if(randomNumber == 2){
                    //set fact to olympic fact
                    fact = "olympic gold medal are actually made mostly of silver";
                }
                else
                    fact = "Sorry there was an error";






                //Update the with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_fact__main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
