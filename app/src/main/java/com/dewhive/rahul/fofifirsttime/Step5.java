package com.dewhive.rahul.fofifirsttime;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Step5 extends AppCompatActivity {

    int[] imageArray = { R.drawable.zero_0p,R.drawable.ten_10p,R.drawable.thirty_30p,R.drawable.fifty_50p,R.drawable.seventy_70p,R.drawable.ninty_90p,R.drawable.hund_100p};
    TextView progressBar;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);

        TextView tvGetTime = (TextView) findViewById(R.id.tvtime);
        String setDateTime = CommonActivity.setUpDateTime();
        tvGetTime.setText(setDateTime);

        TextView step2header = (TextView) findViewById(R.id.tvSubHeaderText);
        step2header.setText(getString(R.string.step5_subheader));

        TextView step2SubDescription = (TextView) findViewById(R.id.tvSubHeaderDescription);
        step2SubDescription.setText(getString(R.string.step5_description));

        TextView step2SubHeaderNo = (TextView) findViewById(R.id.tvSubHeaderNo);
        step2SubHeaderNo.setBackgroundResource(R.drawable.step5);
        final LinearLayout llNetworkConnection=(LinearLayout)findViewById(R.id.llNetAvailable);
        final LinearLayout llProgressUpdate=(LinearLayout)findViewById(R.id.llProgress);

         progressBar=(TextView)findViewById(R.id.progressbar);

        final LinearLayout llOKButton = (LinearLayout) findViewById(R.id.llPressOK);
        Button okButton = (Button) findViewById(R.id.buttonOK);
        llOKButton.postDelayed(new Runnable() {
            public void run() {
                llOKButton.setVisibility(View.VISIBLE);

            }
        }, 3000);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*if(isNetworkAvailable()) {
                llNetworkConnection.setVisibility(View.INVISIBLE);*/
                llOKButton.setVisibility(View.INVISIBLE);
                llProgressUpdate.setVisibility(View.VISIBLE);
               changeProgressImage(imageArray);
               /* if(count==imageArray.length){
                Intent finalPage=new Intent(Step5.this,SetUpComplete.class);
                startActivity(finalPage);}*/
           /* }else{
                llProgressUpdate.setVisibility(View.INVISIBLE);
                llNetworkConnection.setVisibility(View.VISIBLE);
            }*/

            }
        });
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    private void changeProgressImage(final int[] imageArray){
                new Handler().postDelayed(new Runnable() {


            public void run() {
                if (i < imageArray.length){
                    progressBar.setBackgroundResource(imageArray[i]);
                i++;
                changeProgressImage(imageArray);
            }else
                {
                    i=0;
                    }

            }
        },5000);
        if(i==imageArray.length) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    Intent finalPage = new Intent(Step5.this, SetUpComplete.class);
                    startActivity(finalPage);
                    finish();

                }
            }, 5000);
        }

    }
   /* int count=0; //outside oncreate

    //all that is below is within oncreate
    final int[] drawablearray=new int[]{R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};
    new Handler().postDelayed(new Runnable() {
        public void run() {
            if(count<drawablearray.length){
                MainActivity.this.getWindow().
                        setBackgroundDrawableResource(drawablearray[count]);
                count++;
            }
            else{
                count=0;
            }
        }
    }, 5000);*/
}
