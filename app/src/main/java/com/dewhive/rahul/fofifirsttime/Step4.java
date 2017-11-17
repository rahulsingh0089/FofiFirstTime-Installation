package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Step4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);

        TextView tvGetTime=(TextView)findViewById(R.id.tvtime);
        String setDateTime=CommonActivity.setUpDateTime();
        tvGetTime.setText(setDateTime);

        TextView step2header=(TextView)findViewById(R.id.tvSubHeaderText);
        step2header.setText(getString(R.string.step4_subheader));

        TextView step2SubDescription=(TextView)findViewById(R.id.tvSubHeaderDescription);
        step2SubDescription.setText(getString(R.string.step4_description));

        TextView step2SubHeaderNo=(TextView)findViewById(R.id.tvSubHeaderNo);
        step2SubHeaderNo.setBackgroundResource(R.drawable.step4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Step4.this,Step5.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}
