package com.example.aqucare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button analyzeBtn,actionBtn;
    double ph=4.0;
    double temp=40.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        analyzeBtn=(Button) findViewById(R.id.analyze_btn);
        actionBtn=(Button) findViewById(R.id.action);

        setOnClickAnalyze();
        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),action.class);
                startActivity(intent);
            }
        });

    }

    public void setOnClickAnalyze(){
        LinearLayout linear=findViewById(R.id.result_set);

        LayoutInflater li0=getLayoutInflater();
        LayoutInflater li1=getLayoutInflater();
        LayoutInflater li2=getLayoutInflater();
        LayoutInflater li3=getLayoutInflater();
        LayoutInflater li4=getLayoutInflater();
        LayoutInflater li5=getLayoutInflater();
        LayoutInflater li6=getLayoutInflater();
        LayoutInflater li7=getLayoutInflater();
        LayoutInflater li8=getLayoutInflater();
        analyzeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Analyzing...", Toast.LENGTH_LONG).show();
                analyzeBtn.setClickable(false);
                analyzeBtn.setVisibility(View.GONE);
                actionBtn.setVisibility(View.VISIBLE);

                if(ph>7.0 && temp>20){
                    View v=li0.inflate(R.layout.state0,linear,true);
                }
                else if(ph==7.0 && temp>20){

                    View v=li1.inflate(R.layout.state1,linear,true);
                }
                else if(ph>7.0 && temp==20){

                    View v=li2.inflate(R.layout.state2,linear,true);
                }
                else if(ph==7.0 && temp==20){

                    View v=li3.inflate(R.layout.state3,linear,true);
                }
                else if(ph<7.0 && temp<20){

                    View v=li4.inflate(R.layout.state4,linear,true);
                }
                else if(ph==7.0 && temp<20){

                    View v=li5.inflate(R.layout.state5,linear,true);
                }
                else if(ph<7.0 && temp==20){

                    View v=li6.inflate(R.layout.state6,linear,true);
                }
                else if(ph>7.0 && temp<20){

                    View v=li7.inflate(R.layout.state7,linear,true);
                }
                else{
                    View v=li8.inflate(R.layout.state8,linear,true);
                }


            }
        });



    }


}