package com.example.dheeraj.mechspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextBooks extends AppCompatActivity {
    private Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_books);

        button = (Button) findViewById(R.id.handtt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhandtt();
            }
        });
        button1 = (Button) findViewById(R.id.thermodynamics);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openthermodynamics();
            }
        });
        button2 = (Button) findViewById(R.id.fluidmec);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfluidmech();
            }
        });
        button3 = (Button) findViewById(R.id.strength);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstrength();
            }
        });
        button4 = (Button) findViewById(R.id.mechanics);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmechanics();
            }
        });
        button5 = (Button) findViewById(R.id.manufacture);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmanufacture();
            }
        });
        button6 = (Button) findViewById(R.id.iandor);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openiandor();
            }
        });
        button7 = (Button) findViewById(R.id.ref);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openref();
            }
        });
        button8 = (Button) findViewById(R.id.power);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpowerplant();
            }
        });
        button9 = (Button) findViewById(R.id.md);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmd();
            }
        });
        button10 = (Button) findViewById(R.id.tofm);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentofm();
            }
        });
        button11 = (Button) findViewById(R.id.auto);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openauto();
            }
        });
        button12 = (Button) findViewById(R.id.materialscience);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openms();
            }
        });
        button13 = (Button) findViewById(R.id.vib);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvib();
            }
        });
    }

    private void openhandtt() {
        Intent intent = new Intent(this, HeatAndMassTransfer.class);
        startActivity(intent);
    }
    private void openthermodynamics()
    {
        Intent intent = new Intent(this,Thermodynamics.class);
        startActivity(intent);
    }
    private void openfluidmech()
    {
        Intent intent = new Intent(this,FluidMechanics.class);
        startActivity(intent);
    }
    private void openstrength()
    {
        Intent intent = new Intent(this,StrengthOfMaterials.class);
        startActivity(intent);
    }
    private void openmechanics()
    {
        Intent intent = new Intent(this,Mechanics.class);
        startActivity(intent);
    }
    private void openmanufacture()
    {
        Intent intent = new Intent(this,Manufacturing.class);
        startActivity(intent);
    }
    private void openiandor()
    {
        Intent intent = new Intent(this,IndustrialAndOperationsResearch.class);
        startActivity(intent);
    }
    private void openref()
    {
        Intent intent = new Intent(this,Refrigeration.class);
        startActivity(intent);
    }
    private void openmd()
    {
        Intent intent = new Intent(this,MachineDesign.class);
        startActivity(intent);
    }
    private void openpowerplant()
    {
        Intent intent = new Intent(this,PowerPlant.class);
        startActivity(intent);
    }

    private void opentofm()
    {
        Intent intent = new Intent(this,TheoryOfMachines.class);
        startActivity(intent);
    }
    private void openauto()
    {
        Intent intent = new Intent(this,TheoryOfMachines.class);
        startActivity(intent);
    }
    private void openms()
    {
        Intent intent = new Intent(this,MaterialScience.class);
        startActivity(intent);
    }
    private void openvib()
    {
        Intent intent = new Intent(this,Vibrations.class);
        startActivity(intent);
    }
}
