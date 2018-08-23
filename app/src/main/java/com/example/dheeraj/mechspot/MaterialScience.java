package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MaterialScience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_science);
    }
    public void link1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07QzJaZVpaeXBPOFU"));
        startActivity(intent);
    }
    public void link2(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07VmRGQVR4OVludVU"));
        startActivity(intent);
    }
    public void link3(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07S2drblpiZnpDTTA"));
        startActivity(intent);
    }
    public void link4(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B7JWdKw_4Q07c01lNTNkbVAyczA"));
        startActivity(intent);
    }
    public void link5(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceZkUzVldhQ2JGbkU"));
        startActivity(intent);
    }
    public void link6(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6pGoYzCs7PgVE9hNkhhMlUyN3c"));
        startActivity(intent);
    }
    public void link7(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceZGV1emR3QjYteDg"));
        startActivity(intent);
    }
    public void link8(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B9bpsTYXP4ceWFZtVTNxM0VNZkk"));
        startActivity(intent);
    }






}
