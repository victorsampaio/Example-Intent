/**
 * 
 */
package com.example.screen;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * @author VictorSampaio
 * 
 */
public class SecondScreen extends Activity {

	private static final String TAG = "ID";

	@Override
	protected void onCreate(Bundle icicle) {
		// TODO Auto-generated method stub
		super.onCreate(icicle);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {

			String message = extras.getString("message");

			TextView text = new TextView(this);
			text.setText("The message is: " + message);

		} else {
			TextView text = new TextView(this);
			text.setText("This is Activity Two");
			setContentView(text);

		}
	}

	protected void onCreate() {
		super.onStart();
		Log.i(TAG, "SecondScreen .onCreate() executed.");
	}

	protected void onStart() {
		super.onStart();
		Log.i(TAG, "SecondScreen .onStart() executed.");
	}

	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "SecondScreen .onRestart() executed.");
	}

	protected void onResume() {
		super.onResume();
		Log.i(TAG, "SecondScreen .onResume() executed.");
	}

	protected void onPause() {
		super.onPause();
		Log.i(TAG, "SecondScreen .onPause() executed.");
	}

	protected void onStop() {
		super.onStop();
		Log.i(TAG, "SecondScreen .onStop() executed.");
	}

	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "SecondScreen .onDestroy() executed.");
	}

}
