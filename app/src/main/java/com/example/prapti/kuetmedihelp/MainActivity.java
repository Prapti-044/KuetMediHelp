package com.example.prapti.kuetmedihelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String[] vv = {"Doctors","Reception","Ambulance"};

    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView)findViewById(R.id.mylistview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,vv);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Opening information about " + vv[i], Toast.LENGTH_LONG).show();
                if(i==0)
                {
                    Intent myintent=new Intent(view.getContext(),Main2Activity.class);
                    startActivityForResult(myintent,0);
                }
                if(i==1)
                {
                    Intent myintent=new Intent(view.getContext(),Main3Activity.class);
                    startActivityForResult(myintent,1);
                }
                if(i==2)
                {
                    Intent myintent=new Intent(view.getContext(),Main4Activity.class);
                    startActivityForResult(myintent,2);
                }
            }
    });
}
}
