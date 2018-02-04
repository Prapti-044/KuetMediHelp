package com.example.prapti.kuetmedihelp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.*;


public class Main3Activity extends AppCompatActivity {
    Button b31, b32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b31 = (Button) findViewById(R.id.call31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: 0183682367"));
                startActivity(callIntent);
            }
        });
        b32 = (Button) findViewById(R.id.call32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:01920511566"));
                startActivity(callIntent);
            }
        });
    }
}
