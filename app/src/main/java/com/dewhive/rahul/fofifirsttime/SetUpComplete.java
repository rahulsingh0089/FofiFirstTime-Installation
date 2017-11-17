package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetUpComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up_complete);

        TextView tvGetTime = (TextView) findViewById(R.id.tvtime);
        String setDateTime = CommonActivity.setUpDateTime();
        tvGetTime.setText(setDateTime);

        TextView finalHeader = (TextView) findViewById(R.id.tvHeaderText);
        finalHeader.setText(getString(R.string.setup_complete));

        TextView finalSunHeader = (TextView) findViewById(R.id.tvSubHeaderText);
        finalSunHeader.setText(getString(R.string.setup_complete_subheader));

        TextView step2SubDescription = (TextView) findViewById(R.id.tvSubHeaderDescription);
        step2SubDescription.setText(getString(R.string.setup_complete_description));

        TextView step2SubHeaderNo = (TextView) findViewById(R.id.tvSubHeaderNo);
        step2SubHeaderNo.setBackgroundResource(R.drawable.setp_end);

        Button okButton=(Button)findViewById(R.id.finishbuttonOK);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent1 = new Intent(Intent.ACTION_MAIN);
                PackageManager managerclock = getPackageManager();
                try {
                intent1 = managerclock.getLaunchIntentForPackage("com.fofidashboard");
                if (intent1 == null)
                    throw new PackageManager.NameNotFoundException();
                    intent1.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(intent1);*/
                    finish();
                   /* } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }*/

            }
        });
    }
}
