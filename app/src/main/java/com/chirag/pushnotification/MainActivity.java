package com.chirag.pushnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle intent = getIntent().getExtras();

        if (intent != null) {
            String data = intent.getString("test");
            Log.e("MainActivity","Data :"+data);
        }else {
            //Log.e("MainActivity","Data NULLLL");
            Toast.makeText(this, "Data is null", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle inte = intent.getExtras();


    }
}
