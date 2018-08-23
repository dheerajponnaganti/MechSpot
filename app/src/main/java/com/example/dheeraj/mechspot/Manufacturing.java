package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Manufacturing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manufacturing);
    }
    public void link1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07M1F1Nm92TEUzczA"));
        startActivity(intent);
    }
    public void link2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B5CXzYw2DbwIR1FlMW9hMkpQV0k"));
        startActivity(intent);
    }
    public void link3(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B4SQTWiEAAQedmZjQWhJYXBjYlk"));
        startActivity(intent);
    }
    public void link4(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07aXUtT1RYTFR0YWs"));
        startActivity(intent);
    }
    public void link5(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceeUZVdVM1UmhxYnM"));
        startActivity(intent);
    }
    public void link6(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgcWw4ZlN1aWhwUkE"));
        startActivity(intent);
    }
    public void link7(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceTUJFUjJycE5aR00"));
        startActivity(intent);
    }
    public void link8(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07cmVDcG1xd0UxZWc"));
        startActivity(intent);
    }
    public void link9(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07NllHWUF0Z01URkU"));
        startActivity(intent);
    }
    public void link10(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07NVdOanhSRm5PYW8"));
        startActivity(intent);
    }
    public void link11(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4cec0d0X2I0eFBVemc"));
        startActivity(intent);
    }
    public void link12(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07Vjd2ZExMZFpvN2s"));
        startActivity(intent);
    }
}
