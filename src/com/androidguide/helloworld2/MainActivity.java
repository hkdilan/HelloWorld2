package com.androidguide.helloworld2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.v(TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        
        //set xml layout for this Activity.
        setContentView(R.layout.activity_main);
        
        //get references for Views added into above layout
        final EditText etName = (EditText) findViewById(R.id.editText1);
        final TextView tvName = (TextView) findViewById(R.id.textView1);
        final Button btnHi = (Button) findViewById(R.id.button1);
        
        //set button click
        btnHi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//get text user typed.
				final String name = etName.getText().toString();
				//set text in text field.
				tvName.setText("Hello, " + name);
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
