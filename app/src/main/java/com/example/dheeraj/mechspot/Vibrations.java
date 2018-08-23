package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Vibrations extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrations);

    }
    public void link1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgMFF1ZzZXVGtLZHc"));
        startActivity(intent);
    }
    public void link2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceU1M5V0Qtejl4VUU"));
        startActivity(intent);
    }
    public void link3(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B4SQTWiEAAQeMFowVzhSa2s0Rnc"));
        startActivity(intent);
    }
    public void link4(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B4SQTWiEAAQeQnFNZmoxTTFsUUk"));
        startActivity(intent);
    }
    public void link5(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgTlktR0hNRTBhdkU"));
        startActivity(intent);
    }
    public void link6(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgYXBwc2szNVQ4LTg"));
        startActivity(intent);
    }
    public void link7(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgMENHa2lOSEpreTQ"));
        startActivity(intent);
    }
    public void link8(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07Uk1CNVF2TG5DdXc"));
        startActivity(intent);
    }
    public void link9(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07Uk1CNVF2TG5DdXc"));
        startActivity(intent);
    }






}
