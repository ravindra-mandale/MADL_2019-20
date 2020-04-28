package edu.ritindia.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText firstNumber;
    EditText secondNumber;
    Button add;
    Button minus;
    Button mult;
    Button div;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.editText);
        secondNumber = findViewById(R.id.editText2);
        add = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        mult = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        ans = findViewById(R.id.textView3);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double num1;
        double num2;
        ans.setText("");
        try {
            num1 = Double.parseDouble(firstNumber.getText().toString());
            num2 = Double.parseDouble(secondNumber.getText().toString());
            switch (v.getId()){
                case R.id.button:
                    ans.setText(Double.toString(num1+num2));
                    break;
                case R.id.button2:
                    ans.setText(Double.toString(num1-num2));
                    break;
                case R.id.button3:
                    ans.setText(Double.toString(num1*num2));
                    break;
                case R.id.button4:
                    ans.setText(Double.toString(num1/num2));
                    break;
            }
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(),"Invalid input", Toast.LENGTH_SHORT).show();
        }

    }
}
