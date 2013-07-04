package com.example.excommonapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AcceleroMeter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accelero_meter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accelero_meter, menu);
		return true;
	}

}
