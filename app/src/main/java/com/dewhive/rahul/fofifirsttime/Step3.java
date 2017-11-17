package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Step3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);

        TextView tvGetTime=(TextView)findViewById(R.id.tvtime);
        String setDateTime=CommonActivity.setUpDateTime();
        tvGetTime.setText(setDateTime);

        TextView step2header=(TextView)findViewById(R.id.tvSubHeaderText);
        step2header.setText(getString(R.string.step3_subheader));

        TextView step2SubDescription=(TextView)findViewById(R.id.tvSubHeaderDescription);
        step2SubDescription.setText(getString(R.string.step3_description));

        TextView step2SubHeaderNo=(TextView)findViewById(R.id.tvSubHeaderNo);
        step2SubHeaderNo.setBackgroundResource(R.drawable.step3);

        final EditText etLanguageSelection=(EditText)findViewById(R.id.etSelectLanguage);
        etLanguageSelection.setVisibility(View.VISIBLE);

        final TextView tvEnglishLanguage=(TextView)findViewById(R.id.tvEnglishLanguage);
        tvEnglishLanguage.setVisibility(View.VISIBLE);
        final TextView tvKernatakaLanguage=(TextView)findViewById(R.id.tvKernatakaLanguage);
        tvKernatakaLanguage.setVisibility(View.VISIBLE);

        tvKernatakaLanguage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.tvKernatakaLanguage) {
                    tvKernatakaLanguage.setBackgroundResource(R.color.black);
                    etLanguageSelection.setText(tvKernatakaLanguage.getText().toString());
                    tvEnglishLanguage.setFocusable(false);
                    tvEnglishLanguage.setBackgroundColor(Color.TRANSPARENT);
                }else
                    etLanguageSelection.setText("");
            }
        });
        tvEnglishLanguage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.tvEnglishLanguage) {
                    tvEnglishLanguage.setBackgroundResource(R.color.black);
                    etLanguageSelection.setText(tvEnglishLanguage.getText().toString());
                    tvKernatakaLanguage.setFocusable(false);
                    tvKernatakaLanguage.setBackgroundColor(Color.TRANSPARENT);

                } else
                    etLanguageSelection.setText("");
            }
        });

        Button okButton=(Button)findViewById(R.id.buttonOK);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent step4=new Intent(Step3.this,Step4.class);
                startActivity(step4);
                finish();
            }
        });
    }
}
