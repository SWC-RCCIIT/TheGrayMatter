package com.example.voiceprescription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FRONTACTIVITY extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontactivity);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.Gender,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        EditText name =(EditText) findViewById(R.id.editText);
        EditText age =(EditText) findViewById(R.id.editText1);
        Spinner gen = (Spinner) findViewById(R.id.spinner);
        Button pro = (Button)findViewById(R.id.button);

        pro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                Intent in= new Intent(FRONTACTIVITY.this, prescription.class);
                startActivity(in);

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void text1(View view)
    {


    }
}
