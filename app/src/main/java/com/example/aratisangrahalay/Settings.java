package com.example.aratisangrahalay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Settings extends AppCompatActivity {
    Dialog mydialjog;
    TextView closebtn,tutorial,ratethisapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mydialjog=new Dialog(this);
    }

    public void btnclick(View view) {

        mydialjog.setContentView(R.layout.aboutcutom);
        closebtn=(TextView) mydialjog.findViewById(R.id.closeid);
        tutorial=(TextView)mydialjog.findViewById(R.id.tot);
        ratethisapp=(TextView)mydialjog.findViewById(R.id.rate);
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialjog.dismiss();
            }
        });
        mydialjog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mydialjog.show();



    }
}
