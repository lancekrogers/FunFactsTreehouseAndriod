package com.lancekrogers.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private Random randomNum = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare View Variables and assign views to id

        final TextView factLabel = (TextView) findViewById(R.id.fact);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundColor(randomNum.nextInt() + 1);
                String fact = mFactBook.getFact();
                factLabel.setText(fact);

            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

