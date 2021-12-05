package com.example.androidjava;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "mystring";
    private TextView mytxtvw;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String TAG ="MyAppMessage";
        Log.i(TAG, "activating play view");

        mytxtvw=findViewById(R.id.start_text);
        myButton=findViewById(R.id.button);

        onBtnClick();

    }

    public void gameActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Game.class);
        startActivity(intent);
    }

    public void onBtnClick()
    {
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw.setVisibility((mytxtvw.getVisibility() == View.GONE)
                        ? View.VISIBLE : View.GONE);

            }
        });

    }
}