package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.LineNumberReader;

public class Step2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        TextView tvGetTime=(TextView)findViewById(R.id.tvtime);
        String setDateTime=CommonActivity.setUpDateTime();
        tvGetTime.setText(setDateTime);

        TextView step2header=(TextView)findViewById(R.id.tvSubHeaderText);
        step2header.setText(getString(R.string.step6_subheader));

        TextView step2SubDescription=(TextView)findViewById(R.id.tvSubHeaderDescription);
        step2SubDescription.setText(getString(R.string.step6_description));

        TextView step2SubHeaderNo=(TextView)findViewById(R.id.tvSubHeaderNo);
        step2SubHeaderNo.setBackgroundResource(R.drawable.step2);

        final EditText etPinCode=(EditText)findViewById(R.id.etEnterPinCode);
        final TextView tvPinCodeAddress=(TextView)findViewById(R.id.tvPinCodeAddress);
        tvPinCodeAddress.setVisibility(View.INVISIBLE);

        final LinearLayout linearLayout=(LinearLayout)findViewById(R.id.llPressOK);
        linearLayout.setVisibility(View.INVISIBLE);

        Button okButton=(Button)findViewById(R.id.buttonOK);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent step3=new Intent(Step2.this,Step3.class);
                startActivity(step3);
                finish();
            }
        });

        tvPinCodeAddress.postDelayed(new Runnable() {
            public void run() {
                etPinCode.setText("560001");
                tvPinCodeAddress.setVisibility(View.VISIBLE);
                linearLayout.setVisibility(View.VISIBLE);
            }
        }, 3000);
    }
}
