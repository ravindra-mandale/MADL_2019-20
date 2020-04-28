package com.ritabhi.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.gp);
        //rb1 = findViewById(R.id.radioButton);


        bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int select=rg.getCheckedRadioButtonId();
                rb1= findViewById(select);
                if(rg.getCheckedRadioButtonId()!=-1)
                {
                    if(rb1.getText().toString().equals("Narendra Modi"))
                    {
                        Intent i=new Intent(MainActivity.this,que2.class);
                        i.putExtra("key","1");
                        startActivity(i);
                    }
                    else
                    {
                        Intent i1= new Intent(MainActivity.this,que2.class);
                        i1.putExtra("key","0");
                        startActivity(i1);
                    }
                }
                else
                {
                    Intent i1= new Intent(MainActivity.this,que2.class);
                    i1.putExtra("key","0");
                    startActivity(i1);
                }


            }
        });
    }
}
