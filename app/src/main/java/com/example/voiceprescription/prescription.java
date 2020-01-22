package com.example.voiceprescription;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class prescription extends AppCompatActivity {

     Button bt;
     String a;
     String b;
     String c;
     String d;
    String e;
    String f;
    String gi;
    String h;




    //private static final int REQUEST_CODE_SPEECH_INPUT = 1000;

    TextView text1;
    //ImageButton button1;

    TextView text2;
    //ImageButton button2;

    TextView text3;
    //ImageButton button3;

    TextView text4;
    //ImageButton button4;

    TextView text5;
    //ImageButton button5;

    TextView text6;
    //ImageButton button6;*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);

        text1 = findViewById(R.id.editText2);
        //  button1 = findViewById(R.id.imageButton);

        text2 = findViewById(R.id.sym);
        //button2 = findViewById(R.id.b1);

        text3 = findViewById(R.id.dr);
        //button3 = findViewById(R.id.b2);

        text4 = findViewById(R.id.dos);
        //button4 = findViewById(R.id.b3);

        text5 = findViewById(R.id.con);
        // button5 = findViewById(R.id.b4);

        text6 = findViewById(R.id.adv);
        //button6 = findViewById(R.id.b5);*/


        //button click to show voice to text recognition

       /* button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }


        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }


        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }


        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }


        });*/


       bt = findViewById(R.id.generate);
       a= getIntent().getStringExtra("Name");
       b=getIntent().getStringExtra("Age");



        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                opennext();

            }
        });

    }
    public void opennext()
    {

        Intent g = new Intent(prescription.this , fourthactivity.class);
        c=text1.getText().toString();
        d=text2.getText().toString();
        e=text3.getText().toString();
        f=text4.getText().toString();
        gi=text5.getText().toString();
        h=text6.getText().toString();







        g.putExtra("Name1",a);
        g.putExtra("Age1",b);
        g.putExtra("Diag", c);
        g.putExtra("sym", d);
        g.putExtra("drug", e);
        g.putExtra("dosages", f);
        g.putExtra("con", gi);
        g.putExtra("adv", h);



        startActivity(g);
    }




    public void get1(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 10);

        }


    }

    public void get2(View view) {
        Intent intent1 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent1, 11);

        }


    }
    public void get3(View view) {
        Intent intent2 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent2.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent2.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent2.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent2, 12);

        }
    }

    public void get4(View view) {
        Intent intent3 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent3.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent3.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent3.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent3, 13);

        }
    }

    public void get5(View view) {
        Intent intent4 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent4.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent4.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent4.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent4, 14);

        }
    }

    public void get6(View view) {
        Intent intent5 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent5.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent5.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent5.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent5, 15);

        }
    }


    /*private void speak() {
        //intent to show speech to text dialog
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Analyze Diagnosis");

        //start intent
        try {
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);

        } catch (Exception e) {

            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    //receive voice input and handle it
    */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text1.setText(result.get(0));


                }
                break;
            case 11:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text2.setText(result.get(0));


                }
                break;
            case 12:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text3.setText(result.get(0));


                }
                break;
            case 13:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text4.setText(result.get(0));


                }
                break;

            case 14:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text5.setText(result.get(0));


                }
                break;

            case 15:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text6.setText(result.get(0));


                }
                break;




        }
    }


}





