package com.example.convertitoremigliakilometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    // Numbers for conversions.

    private static final double MILES_TO_KILOMETERS = 1.6093;

    private static final double KILOMETERS_TO_MILES = 0.6214;


    ////////////////////////////////////////////////////////

    private EditText editTextNumberDecimalNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumberDecimalNumber = (EditText) (findViewById(R.id.editTextNumberDecimalNumber));

    }

    public void convertMilesToKm(View view)
    {
        if (checkValue())
        {
            double number = Double.parseDouble(String.valueOf(editTextNumberDecimalNumber.getText()));

            double result = number * MILES_TO_KILOMETERS;

            editTextNumberDecimalNumber.setText(String.valueOf(result));
        }
    }

    private boolean checkValue()
    {
        return editTextNumberDecimalNumber.getText().toString().trim().length() != 0;
    }

    public void convertKmToMiles(View view)
    {
        if (checkValue())
        {
            double number = Double.parseDouble(String.valueOf(editTextNumberDecimalNumber.getText()));

            double result = number * KILOMETERS_TO_MILES;

            editTextNumberDecimalNumber.setText(String.valueOf(result));
        }
    }

}