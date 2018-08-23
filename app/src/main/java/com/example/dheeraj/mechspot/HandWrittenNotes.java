package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HandWrittenNotes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand_written_notes);
    }
    public void kit1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B1Tz_VymrizyX3ZvanFNdUVzWGM"));
        startActivity(intent);
    }
    public void kit2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B3G20YUMiOipTXdxY080dnEzZ00"));
        startActivity(intent);
    }
    public void ace(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B1f9u9U2wIRZU0JXdy1oS0h5bm8"));
        startActivity(intent);
    }
    public void ther(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B9bpsTYXP4ceNW1mV05xWkZqbGc/view"));
        startActivity(intent);
    }
    public void mech(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B9bpsTYXP4cedGNMY3lVbmxOOHM/view"));
        startActivity(intent);
    }
}
