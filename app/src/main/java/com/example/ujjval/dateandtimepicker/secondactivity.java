package com.example.ujjval.dateandtimepicker;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

/**
 * Created by UJJVAL on 6/25/2017.
 */

public class secondactivity extends Activity{


    @Override
        // Method to link the JAVA class and Layout.
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout );
    }
        // Method to call the main dateandtime activity
       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton3);
         //   fab.setOnClickListener(new View.OnClickListener() {
       // @Override
         public void nextAct(View v){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
