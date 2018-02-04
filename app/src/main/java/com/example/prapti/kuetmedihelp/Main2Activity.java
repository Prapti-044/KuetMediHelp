package com.example.prapti.kuetmedihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    final String[] name = {"Dr. Rifat Sultana Shelly","Dr. Rafiqul Islam","Dr. Jashim Uddin","Dr. S.M. Arif Iftekhar","Dr. Faysal Muhammad Ariful Islam","Dr. Kamal Uddin","Dr. Biplob Kumar Dey"};

    ListView l2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        l2=(ListView)findViewById(R.id.mylistview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,name);
        l2.setAdapter(adapter);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int ii, long ll) {
                Toast.makeText(getApplicationContext(), "Opening information about " + name[ii], Toast.LENGTH_LONG).show();
                if(ii==0)
                {
                    Intent myintent=new Intent(view.getContext(),Main5Activity.class);
                    startActivityForResult(myintent,0);
                }
                if(ii==1)
                {
                    Intent myintent=new Intent(view.getContext(),Main6Activity.class);
                    startActivityForResult(myintent,1);
                }
                if(ii==2)
                {
                    Intent myintent=new Intent(view.getContext(),Main7Activity.class);
                    startActivityForResult(myintent,2);
                }
                if(ii==3)
                {
                    Intent myintent=new Intent(view.getContext(),Main8Activity.class);
                    startActivityForResult(myintent,3);
                }
                if(ii==4)
                {
                    Intent myintent=new Intent(view.getContext(),Main9Activity.class);
                    startActivityForResult(myintent,4);
                }
                if(ii==5)
                {
                    Intent myintent=new Intent(view.getContext(),Main10Activity.class);
                    startActivityForResult(myintent,5);
                }
                if(ii==6)
                {
                    Intent myintent=new Intent(view.getContext(),Main11Activity.class);
                    startActivityForResult(myintent,6);
                }
            }
        });
    }
}
