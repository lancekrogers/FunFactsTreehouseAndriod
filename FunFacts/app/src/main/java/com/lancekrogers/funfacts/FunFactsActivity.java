package com.lancekrogers.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare View Variables and assign views to id

        final TextView factLabel = (TextView) findViewById(R.id.fact);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

