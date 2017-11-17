package com.dewhive.rahul.fofifirsttime;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.time);
        String getDateTime=CommonActivity.setUpDateTime();
        tv.setText(getDateTime);

       /* SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean previouslyStarted = prefs.getBoolean("firstTime", false);
        if(!previouslyStarted) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putBoolean("firstTime", Boolean.TRUE);
            edit.commit();*/
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(MainActivity.this,Step1.class);
                    startActivity(intent);
                    finish();

                }
            },5000);
       /* }else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
            Intent intent1 = new Intent(Intent.ACTION_MAIN);
            PackageManager managerclock = getPackageManager();
            try {
                intent1 = managerclock.getLaunchIntentForPackage("com.fofidashboard");
                if (intent1 == null)
                    throw new PackageManager.NameNotFoundException();

                intent1.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(intent1);
                finish();
                *//*new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 5000);*//*

            } catch (PackageManager.NameNotFoundException e) {

            }
        }
                },5000);
        }
*/



    }

}
