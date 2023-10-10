package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText edibay,edisell;
  Button button1;
  TextView texview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edibay=findViewById(R.id.edibay);
        edisell=findViewById(R.id.edisell);
        button1=findViewById(R.id.button1);
        texview1=findViewById(R.id.texview1);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Float s1,s2,profit,profitparcent ;


             String my= edibay.getText().toString();
              s1=Float.parseFloat(my);



               String m1=edisell.getText().toString();
             s2=Float.parseFloat(m1);


              profit = s1-s2;
              profitparcent=profit/s1*100;

              texview1.setText(" profit is"+profit+"\n"+"profit % ="+profitparcent);





            }
        });







    }
}