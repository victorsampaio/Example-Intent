package com.example.screenYesNo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.exampleintent.R;


/**
 * @author VictorSampaio
 */
public class ScreenYesOrNo extends Activity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_screen_yes_or_no);
		
		//Yes
		Button yes =(Button)findViewById(R.id.btYes);
		yes.setText("Yes");
		yes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.putExtra("msg", "Selected YES!");
				setResult(1, it);
				finish();
				
			}
		});
		
		//No
		Button no = (Button)findViewById(R.id.btNo);
		no.setText("No");
		no.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent();
				it.putExtra("msg", "Selected No!");
				setResult(2, it);
				finish();
			}
		});
		
	}


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.screen_yes_or_no, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
