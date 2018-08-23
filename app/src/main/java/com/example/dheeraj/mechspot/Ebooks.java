package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Ebooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooks);
    }
    public void rajput(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1J-5EAHwVE45JZqOXVZ-pq9Wyz-yT8H8K/view?usp=sharing"));
        startActivity(intent);
    }
    public void fluidm(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1AxLayQRAcFoozfqBMiSM2TTdScJr8lML/view?usp=sharing"));
        startActivity(intent);
    }
    public void md(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1f4_wKZZ_a0Cb2ClmLWld35s3AczB7mKG/view?usp=sharing"));
        startActivity(intent);
    }
    public void tm(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1f4_wKZZ_a0Cb2ClmLWld35s3AczB7mKG/view?usp=sharing"));
        startActivity(intent);
    }
    public void em(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hmPEYwgUtyNJwd2mVAM6gGCkaeTzqgZf/view?usp=sharing"));
        startActivity(intent);
    }
    public void thermo(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18mkgtbfy_zT3N8_sgYcmSS84gvZ9rNRa/view?usp=sharing"));
        startActivity(intent);
    }
    public void auto(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B9bpsTYXP4ceOUFZN2EzaUc1dm8/view"));
        startActivity(intent);
    }
    public void ms(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B7JWdKw_4Q07c01lNTNkbVAyczA/view"));
        startActivity(intent);
    }
    public void mt(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B9bpsTYXP4ceTUJFUjJycE5aR00/view"));
        startActivity(intent);
    }


}
