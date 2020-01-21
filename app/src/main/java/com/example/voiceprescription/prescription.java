package com.example.voiceprescription;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class prescription extends AppCompatActivity {

    private static final int REQUEST_CODE_SPEECH_INPUT = 1000 ;

    TextView textview1;
    ImageButton imagebutton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);

        textview1 = findViewById(R.id.editText2);
        imagebutton1 = findViewById(R.id.imageButton);

        //button click to show voice to text recognition

        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });

    }

    private void speak() {
        //intent to show speech to text dialog
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Please Say the symptoms..");

        //start intent
        try{
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);

        }
        catch(Exception e){

            Toast.makeText(this,""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    //receive voice input and handle it

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case REQUEST_CODE_SPEECH_INPUT:
                {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    textview1.setText(result.get(0));
                }

                break ;
            }
        }
    }
}
