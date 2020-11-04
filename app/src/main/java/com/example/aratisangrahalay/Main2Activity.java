package com.example.aratisangrahalay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView listView;
    String[] ganptiartya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=(ListView)findViewById(R.id.listview);

        //import String Array in java
        ganptiartya=getResources().getStringArray(R.array.Ganpatichyartya);

        //Add the Adapter for Listview
        final ArrayAdapter<String> listadapter=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1,ganptiartya);
         listView.setAdapter(listadapter);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                 Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                 intent.putExtra("ganpatiartya",listView.getItemAtPosition(position).toString());
                 startActivity(intent);
             }
         });
    }
}
