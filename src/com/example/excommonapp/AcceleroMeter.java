package com.example.excommonapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class AcceleroMeter extends Activity implements SensorEventListener{
	
	private SensorManager mSensorManager;
	private Sensor mSensor;
	TextView textView1;
	int count = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accelero_meter);
		
		textView1 = (TextView) findViewById(R.id.textView1);
		textView1.setText("lol");
		mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
		
		mSensorManager.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_FASTEST);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accelero_meter, menu);
		return true;
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		count++;
		textView1.setText("rofl"+count);
		final float alpha = 0.8f;

		  float[] gravity = new float[3];
		// Isolate the force of gravity with the low-pass filter.
		  gravity[0] = alpha * gravity[0] + (1 - alpha) * event.values[0];
		  gravity[1] = alpha * gravity[1] + (1 - alpha) * event.values[1];
		  gravity[2] = alpha * gravity[2] + (1 - alpha) * event.values[2];

		  float[] linear_acceleration = new float[3];
		// Remove the gravity contribution with the high-pass filter.
		  linear_acceleration[0] = event.values[0] - gravity[0];
		  linear_acceleration[1] = event.values[1] - gravity[1];
		  linear_acceleration[2] = event.values[2] - gravity[2];
		  textView1.setText("rofl "+linear_acceleration[0]);
	}

}
