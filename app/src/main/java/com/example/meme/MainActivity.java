package com.example.meme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO task2
    }



      /*  private final static String LOG_TAG = MainActivity.class.getSimpleName();

        public void buttonPressed (View view)
        {

            Log.i(LOG_TAG, "button press started");

            String x = "Hello worlds!!";
            mTextView.setText(x);
            Log.v(LOG_TAG, "text changed to" + x);

            Log.d(LOG_TAG, "button press fininshed");
        }*/


}
