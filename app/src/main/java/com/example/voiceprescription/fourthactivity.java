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

    TextView tv2;
    String st2;

    TextView tv3;
    String st3;

    TextView tv4;
    String st4;

    TextView tv5;
    String st5;

    TextView tv6;
    String st6;


    TextView tv7;
    String st7;



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



        tv2 =findViewById(R.id.diag);
        st2=getIntent().getStringExtra("Diag");
        tv2.setText(st2);

        tv3 =findViewById(R.id.sym);
        st3=getIntent().getStringExtra("sym");
        tv3.setText(st3);

        tv4 =findViewById(R.id.drg);
        st4=getIntent().getStringExtra("drug");
        tv4.setText(st4);


        tv5 =findViewById(R.id.dos);
        st5=getIntent().getStringExtra("dosages");
        tv5.setText(st5);

        tv6 =findViewById(R.id.per);
        st6=getIntent().getStringExtra("con");
        tv6.setText(st6);


        tv7 =findViewById(R.id.adv);
        st7=getIntent().getStringExtra("adv");
        tv7.setText(st7);




    }
}
