package com.example.ujjval.dateandtimepicker;

import java.text.DateFormat;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import android.widget.TextView;
import android.widget.TimePicker;
import android.support.v4.app.DialogFragment;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements
        DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener{

    Button b_pick;
    TextView tv_result;
    int day, month, year, hour, minute;
    int dayFinal, monthFinal, yearFinal, hourFinal, minuteFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_pick = (Button) findViewById(R.id.b_pick);
        tv_result = (TextView) findViewById(R.id.tv_result);

        b_pick.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, MainActivity.this, year, month, day);
                datePickerDialog.show();

            }

        });
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        yearFinal = i;
        monthFinal = i1+1;
        dayFinal = i2;

        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, MainActivity.this, hour, minute, android.text.format.DateFormat.is24HourFormat(this));
        timePickerDialog.show();

    }

    @Override
    public void onTimeSet(TimePicker TimePicker, int i, int i1) {
        hourFinal = i;
        minuteFinal = i1;

        tv_result.setText(       "year"+ yearFinal + '\n' + '\n' + '\n' + '\n' + '\n' +
                                 "month"+ monthFinal + '\n' +'\n' +'\n' +'\n' +'\n' +
                                 "day"+ dayFinal + '\n' + '\n' + '\n' + '\n' + '\n' +
                                 "hour"+ hourFinal + '\n' + '\n' + '\n' + '\n' +
                                 "minute"+ minuteFinal);


    }




}
