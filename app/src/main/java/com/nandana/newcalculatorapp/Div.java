package com.nandana.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nandana.newcalculatorapp.R;

public class Div extends AppCompatActivity {

    EditText ed1,ed2;
    Button b1,b2;
    String getNum1,getNum2,result;
    int num1,num2,quotient;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        ed1=(EditText) findViewById(R.id.n1);
        ed2=(EditText) findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.div);
        b2=(Button) findViewById(R.id.m4);
        t1=(TextView) findViewById(R.id.res);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                quotient=num1/num2;
                result=String.valueOf(quotient);
                t1.setText(result);
            }
        });

    }
}