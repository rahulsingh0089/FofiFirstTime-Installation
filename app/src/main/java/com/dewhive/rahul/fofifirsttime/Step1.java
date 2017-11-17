package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class Step1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);

        TextView tv=(TextView)findViewById(R.id.tvtime);
        String getDateTime=CommonActivity.setUpDateTime();
        tv.setText(getDateTime);
        TextView subheaderDescription=(TextView)findViewById(R.id.tvSubHeaderDescription);
        subheaderDescription.setText(getString(R.string.step1_description));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Step1.this,Step2.class);
                startActivity(intent);
                finish();

            }
        },5000);


    }

}
