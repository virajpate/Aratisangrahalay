package com.example.aratisangrahalay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    String[] my_string;
    String[] mystring2;

    //this variabels for separate each textview
    int index=0;
    int index1=1;
    int index2=2;
    int index3=3;
    int index4=4;
    int index5=5;
    int index6=6;
    int index7=7;
    int index8=8;
    int index9=9;
    int index10=10;
    int index11=11;
    int index12=12;
    int index13=13;
    int index14=14;
    int index15=15;
    int index16=16;
    int index17=17;
    int index18=18;
    int index19=19;
    int index20=20;
    int index21=21;
    int index22=22;
    int index23=23;
    int index24=24;
    int index25=25;
    int index26=26;
    int index27=27;
    int index28=28;
    int index29=29;
    int index30=30;
    int index31=31;
    int index32=32;
    int index33=33;
    int index34=34;
    int index35=35;
    int index36=36;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv5=(TextView)findViewById(R.id.tv5);
        tv6=(TextView)findViewById(R.id.tv6);
        tv7=(TextView)findViewById(R.id.tv7);
        tv8=(TextView)findViewById(R.id.tv8);

        //import String Array in java
        my_string=getResources().getStringArray(R.array.Ganpatichyartya);
        mystring2=getResources().getStringArray(R.array.ganpatiartya2);

        //Declare Values for our variable

        Bundle bundle=getIntent().getExtras(); //get intent from mainactivity2

        if (bundle != null) {

            tv1.setText(bundle.getString("ganpatiartya"));
            if (tv1.getText().toString().equalsIgnoreCase("सुखकर्ता दुःखहर्ता")) {
                tv2.setText(mystring2[index]);
                tv3.setText(mystring2[index1]);
                tv4.setText(mystring2[index2]);
                tv5.setText(mystring2[index3]);
                tv6.setText(mystring2[index4]);
                tv7.setText(mystring2[index5]);


            }
            else if (tv1.getText().toString().equalsIgnoreCase("नानापरिमळ दुर्वा शेंदूर"))
            {
                tv2.setText(mystring2[index6]);
                tv3.setText(mystring2[index7]);
                tv4.setText(mystring2[index8]);
                tv5.setText(mystring2[index9]);
                tv6.setText(mystring2[index10]);
                tv7.setText(mystring2[index11]);

            }
            else if (tv1.getText().toString().equalsIgnoreCase("शेंदूर लाल चढायो"))
            {
                tv2.setText(mystring2[index12]);
                tv3.setText(mystring2[index13]);
                tv4.setText(mystring2[index14]);
                tv5.setText(mystring2[index15]);
                tv6.setText(mystring2[index16]);
                tv7.setText(mystring2[index17]);
            }
            else if (tv1.getText().toString().equalsIgnoreCase("उंदरावरि बैसोनि"))
            {
                tv2.setText(mystring2[index18]);
                tv3.setText(mystring2[index19]);
                tv4.setText(mystring2[index20]);
                tv5.setText(mystring2[index21]);
                tv6.setText(mystring2[index22]);
                tv7.setText(mystring2[index23]);
                tv8.setText(mystring2[index24]);

            }
            else if (tv1.getText().toString().equalsIgnoreCase("वेदशास्त्रांमाजी तूं मंगलमूर्ती"))
            {
                tv2.setText(mystring2[index25]);
                tv3.setText(mystring2[index26]);
                tv4.setText(mystring2[index27]);
                tv5.setText(mystring2[index28]);
                tv6.setText(mystring2[index29]);
                tv7.setText(mystring2[index30]);

            }
            else if (tv1.getText().toString().equalsIgnoreCase("प्रथम तुला वंदितो"))
            {
                tv2.setText(mystring2[index31]);
                tv3.setText(mystring2[index32]);
                tv4.setText(mystring2[index33]);
                tv5.setText(mystring2[index34]);
                tv6.setText(mystring2[index35]);
                tv7.setText(mystring2[index36]);

            }
        }

    }
}
