package com.example.first;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout.LayoutParams lp;
        lp = new LinearLayout.LayoutParams(
        		LinearLayout.LayoutParams.FILL_PARENT,
        		LinearLayout.LayoutParams.FILL_PARENT
        		);
        LinearLayout.LayoutParams text1loutp;
        text1loutp = new LinearLayout.LayoutParams(
        		LinearLayout.LayoutParams.FILL_PARENT,
        		LinearLayout.LayoutParams.WRAP_CONTENT
        		);
        LinearLayout lout = new LinearLayout(this);
        lout.setOrientation(LinearLayout.VERTICAL);
        
        TextView textview1 = new TextView(this);
        textview1.setText(getString(R.string.ok));
     
        lout.addView(textview1, text1loutp);
        this.addContentView(lout, lp);
        textview1.setText(getString(R.string.textstr2));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
