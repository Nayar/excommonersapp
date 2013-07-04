package com.example.excommonapp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button buttonGoToAcc = (Button) findViewById(R.id.button_go_to_acc);
		buttonGoToAcc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				goToAccAct();
				
			}
		});
	}
	
	public void goToAccAct(){
		Intent acceleroMeterAct = new Intent(this,AcceleroMeter.class);
		startActivity(acceleroMeterAct);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
