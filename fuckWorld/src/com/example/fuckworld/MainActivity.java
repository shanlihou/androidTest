package com.example.fuckworld;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	private final String TAG = "Main";
	private Button button;
	private MyApp myApp;
	private Button.OnClickListener button_listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.i(TAG, "hello");
        super.onCreate(savedInstanceState);

    	Log.i(TAG, "setContent");
        setContentView(R.layout.activity_main);

    	Log.i(TAG, "end");
        button = (Button)this.findViewById(R.id.button);

    	Log.i(TAG, "end2");
    	button_listener = new View.OnClickListener() 
        {
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Log.i(TAG, "end");
				myApp = (MyApp)getApplication();
				myApp.setName("chen");
				Intent intent = new Intent(MainActivity.this, OtherActivity.class);
				startActivity(intent);
			}

		};
		Log.i(TAG, "end3");
        button.setOnClickListener(button_listener);

    	Log.i(TAG, "end4");
    }

}
