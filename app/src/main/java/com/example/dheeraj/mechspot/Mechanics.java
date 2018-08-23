package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mechanics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
    }
    public void link1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceTnBneXhzRV96dWs"));
        startActivity(intent);
    }
    public void link2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceSVJ0Rk83OGRoVmc"));
        startActivity(intent);
    }
    public void link3(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceY1A0TDNiQ1NOb0U"));
        startActivity(intent);
    }
    public void link4(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceVndXaXQ1ZkZKREU"));
        startActivity(intent);
    }
    public void link5(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceQ0lqdzZ1SERWb3M"));
        startActivity(intent);
    }
    public void link6(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceSUZLaEYyNDRGMWs"));
        startActivity(intent);
    }
    public void link7(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceRjBJQjd1UTVmNHM"));
        startActivity(intent);
    }
    public void link8(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceQ1o1OE83WEtOTk0"));
        startActivity(intent);
    }
}
