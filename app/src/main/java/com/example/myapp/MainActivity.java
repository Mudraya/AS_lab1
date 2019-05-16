package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.AlertDialog;
import android.view.View;
import android.widget.Adapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSelection(View v) {
        TextView selection = (TextView) findViewById(R.id.selection);
        RadioGroup radGrp = (RadioGroup)findViewById(R.id.radios);
        int selectedId = radGrp.getCheckedRadioButtonId();
        if (selectedId != -1 ) {
            RadioButton radioBttn = (RadioButton) findViewById(selectedId);
            selection.setText("You are " + radioBttn.getText().toString());
        }
        else { selection.setText("Select something"); }
    }
}
