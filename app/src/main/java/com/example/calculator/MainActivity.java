package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Field1;
    private EditText Field2;
    private TextView Result;
    private Button Mode;
    private Button Calc;
    private int i=0;
    private String arr[]={"Addition","Subtraction","Multiplication","Division"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Field1=findViewById(R.id.Field1);
        Field2=findViewById(R.id.Field2);
        Result=findViewById(R.id.Result);
        Mode=findViewById(R.id.Mode);
        Calc=findViewById(R.id.Calculate);
    }
    public void onModePressed(View view)
    {
        i++;
        i=i%4;
        Mode.setText("MODE: "+arr[i]);

    }
    public void onCalcPressed(View view)
    {
        String s1=Field1.getText().toString(),s2=Field2.getText().toString();
        if(!s1.equals("")&&!s2.equals("")){
            double a=Double.parseDouble(Field1.getText().toString());
            double b=Double.parseDouble(Field2.getText().toString());
            if(i==0)
                Result.setText(String.format("%.4f",a+b));
            else if(i==1)
                Result.setText(String.format("%.4f",a-b));
            else if(i==2)
                Result.setText(String.format("%.4f",a*b));
            else
            if(b==0)
                Result.setText("Cannot divide by zero");
            else
                Result.setText(String.format("%.4f",a/b));

        }
        else
            Result.setText("");
    }

}
