package com.example.androidpractice.funfact;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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





                //Update the with our dynamic fact
                factLabel.setText("");
            }
        };
        showFactButton.setOnClickListener(listener);

    }


}
