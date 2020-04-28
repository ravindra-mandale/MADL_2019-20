package com.ritabhi.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class que2 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que2);
        rg = findViewById(R.id.gp3);
        //rb1 = findViewById(R.id.radioButton);

        bt = findViewById(R.id.button2);



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
                    if(rb1.getText().toString().equals("Delhi"))
                    {
                        i = Integer.parseInt(count)+1;
                        Intent intent1 = new Intent(que2.this,que3.class);
                        intent1.putExtra("key",i+"");
                        startActivity(intent1);

                    }
                    else
                    {
                        i= Integer.parseInt(count);
                        Intent intent1 = new Intent(que2.this,que3.class);
                        intent1.putExtra("key",i+"");
                        startActivity(intent1);
                    }

                }
                else
                {
                    i= Integer.parseInt(count);
                    Intent intent1 = new Intent(que2.this,que3.class);
                    intent1.putExtra("key",i+"");
                    startActivity(intent1);
                }
            }
        });
    }
}
