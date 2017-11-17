package com.dewhive.rahul.fofifirsttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class CommonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        TextView tv=(TextView)findViewById(R.id.tvtime);
        String setTime=setUpDateTime();
        tv.setText(setTime);
    }
    public static String setUpDateTime(){

        Calendar c = Calendar.getInstance();
        String format;
        if(c.get(Calendar.AM_PM)==Calendar.AM)
            format="AM";
        else format="PM";
        String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        String datetime=c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+" "+format
                +" | "+month+" "+c.get(Calendar.DAY_OF_MONTH)+", "+c.get(Calendar.YEAR);
        Log.d("DateandTime:", "Time is: "+datetime);
        return datetime;

        //tv.setText(datetime);

    }
}
