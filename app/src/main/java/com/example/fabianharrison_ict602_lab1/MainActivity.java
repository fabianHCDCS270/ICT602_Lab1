package com.example.fabianharrison_ict602_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvMessage;
    Button submitButton;
    EditText etName;
    //int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView1);
        submitButton = (Button) findViewById(R.id.button1);
        etName = (EditText) findViewById(R.id.editText);
    }

    public void displayText(View view){

        String text_input = etName.getText().toString();
        String welcome_text = "Welcome!  ";

        tvMessage.setText(welcome_text + text_input);

        Toast toast = Toast.makeText(this, "WELCOME "+text_input, Toast.LENGTH_SHORT);
        toast.show();
    }



    public void resetText(View view) {

        etName.getText().clear();

        String text = etName.getText().toString();

        tvMessage.setText(text);

        Toast toast = Toast.makeText(this, "NAME RESET", Toast.LENGTH_SHORT);
        toast.show();
    }

}