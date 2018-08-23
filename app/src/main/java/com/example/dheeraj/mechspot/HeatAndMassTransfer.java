package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HeatAndMassTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat_and_mass_transfer);
    }
    public void link1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceUEgzVHVQLWFDd2s"));
        startActivity(intent);
    }
    public void link2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceWHlDWWlHdEx6aFE"));
        startActivity(intent);
    }
    public void link3(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4cebkg2WF91b25DVFE"));
        startActivity(intent);
    }
    public void link4(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceaTJoNFpKS0FzblU"));
        startActivity(intent);
    }
    public void link5(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07dnh5bXk5X0tRV0E"));
        startActivity(intent);
    }
    public void link6(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07UTdOOUpydU51ZWM"));
        startActivity(intent);
    }
    public void link7(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07TkpDbi1mbnpWUjA"));
        startActivity(intent);
    }

    public void link8(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07MGtkTnVMT1FIRFE"));
        startActivity(intent);
    }
    public void link9(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07cldUV3RqS2ZTN1k"));
        startActivity(intent);
    }

}
