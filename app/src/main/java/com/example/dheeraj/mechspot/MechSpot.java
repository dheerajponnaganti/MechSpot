package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MechSpot extends AppCompatActivity {

    private Button button,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech_spot);


        button =(Button) findViewById(R.id.ebooks);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEbooks();
            }
        });

        button2 =(Button) findViewById(R.id.textbooks);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTextbooks();
            }
        });
        button3 =(Button) findViewById(R.id.handbooks);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHandbooks();
            }
        });
        button4 =(Button) findViewById(R.id.credits);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCredits();
            }
        });


    }
    private void openEbooks()
    {
        Intent intent = new Intent(this,TextBooks.class);
        startActivity(intent);
    }
    private void openTextbooks()
    {
        Intent intent = new Intent(this,Ebooks.class);
        startActivity(intent);
    }
    private void openHandbooks()
    {
        Intent intent = new Intent(this,HandWrittenNotes.class);
        startActivity(intent);
    }
    private void openCredits()
    {
        Intent intent = new Intent(this,credits.class);
        startActivity(intent);
    }

}
