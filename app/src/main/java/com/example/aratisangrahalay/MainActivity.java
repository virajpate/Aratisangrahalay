package com.example.aratisangrahalay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private Toolbar tb;
    private LinearLayout ll,ll2;
    private TextView tv1;
    private ImageView iv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //dashboard coding & Animation coading
        tv1=(TextView)findViewById(R.id.tv1);
        iv1=(ImageView)findViewById(R.id.iv1);
        ll=(LinearLayout)findViewById(R.id.GA);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gan=new Intent(MainActivity.this,Main2Activity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(iv1,"Imagetransation1");
                pairs[1]=new Pair<View,String>(tv1,"Texttransaction1");



                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(gan,options.toBundle());
            }
        });


        //toolbar coding
        tb=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setTitle("Arati");

        //drawer
        dl = (DrawerLayout)findViewById(R.id.drawer);
        t=new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.tutorials:
                        Toast.makeText(MainActivity.this, "Tutorial",Toast.LENGTH_SHORT).show();break;
                    case R.id.shareapp:
                        Intent a = new Intent(Intent.ACTION_SEND);
                        final String appPackageName = getApplicationContext().getPackageName();
                        String strAppLink = "";

                        try
                        {
                            strAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
                        }
                        catch (android.content.ActivityNotFoundException anfe)
                        {
                            strAppLink = "https://play.google.com/store/apps/details?id=" + appPackageName;
                        }

                        a.setType("text/link");
                        String shareBody = "Hey! Download by app for free and win amazing cash prizes." +
                                "\n"+""+strAppLink;
                        String shareSub = "Aarati sangrahalay";
                        a.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                        a.putExtra(Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(a, "Share Using"));

                        break;
                    case R.id.likeus:
                        Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100005010948442");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);

                        break;

                    case R.id.setting:
                       Intent set=new Intent(MainActivity.this,Settings.class);
                       startActivity(set);
                       break;

                    case R.id.feedback:
                        Intent intent1=new Intent(MainActivity.this,Feedback.class);
                        startActivity(intent1);
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(t.onOptionsItemSelected(item)) {
            return true;
        }


        int id = item.getItemId();//serch btn & love btn
        switch (id){

            case R.id.search:
                Toast.makeText(getApplicationContext(),"search",Toast.LENGTH_LONG).show();
                return true;
            case R.id.love:
                Toast.makeText(getApplicationContext(),"love",Toast.LENGTH_LONG).show();
                return true;

        }


        return super.onOptionsItemSelected(item);
    }







}

