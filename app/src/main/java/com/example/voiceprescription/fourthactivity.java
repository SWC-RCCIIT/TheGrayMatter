package com.example.voiceprescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class fourthactivity extends AppCompatActivity {

    TextView tv;
    String st;
    TextView tv1;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);

        tv=findViewById(R.id.textView5);
        st= getIntent().getStringExtra("Name1");
        Log.i("TAG",st);
        tv.setText(st);

        tv1 =findViewById(R.id.textView8);
        st1=getIntent().getStringExtra("Age1");
        tv1.setText(st1);

    }
}
