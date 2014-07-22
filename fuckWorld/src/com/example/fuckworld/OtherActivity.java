package com.example.fuckworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	
	private MyApp myApp;
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		textView = (TextView)this.findViewById(R.id.msg);
		myApp = (MyApp)getApplication();
		textView.setText("-appname-->>"+myApp.getName());
	}

}
