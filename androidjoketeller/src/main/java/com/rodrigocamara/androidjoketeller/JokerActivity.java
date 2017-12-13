package com.rodrigocamara.androidjoketeller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {
    private TextView tvJoke;
    private static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        String joke = getIntent().getExtras().getString(JOKE_EXTRA);

        tvJoke = findViewById(R.id.tvJoke);

        if (joke != null) {
            tvJoke.setText(joke);
        }
    }
}
