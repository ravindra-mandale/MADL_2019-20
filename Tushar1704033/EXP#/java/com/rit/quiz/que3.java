package com.ritabhi.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class que3 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que4);
        rg = findViewById(R.id.group);
        //rb1 = findViewById(R.id.radioButton);

        bt = findViewById(R.id.button4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=0;
                int select = rg.getCheckedRadioButtonId();
                rb1 = findViewById(select);
                Intent intent=getIntent();
                String count=intent.getStringExtra("key");
                if(rg.getCheckedRadioButtonId()!=-1)
                {
                    if(rb1.getText().toString().equals("Mumbai"))
                    {
                        i = Integer.parseInt(count)+1;

                    }
                    else
                    {
                        i= Integer.parseInt(count);
                    }
                    Toast.makeText(getApplicationContext(),""+i,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),""+count,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
