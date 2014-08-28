package com.example.exampleintent;

import com.example.screen.SecondScreen;

import android.R.anim;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

/**
 * @author VictorSampaio
 * 
 */
public class IntentMenu extends ListActivity {
	private static final String CATEGORY = "AndroidIntent";

	// To identify the method onActivityResult
	private static final int ACTIVITY_YES_NO = 1;

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_intent_menu);

		String[] topic = new String[] {
				"1","2","3","4"
		};

		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, topic));
	}
	
	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
		try {
			switch (position) {
			case 0:
					Intent intent = new Intent(this, SecondScreen.class);
					intent.putExtra("Message", "Test to Intent. This is Second Screen!");
					startActivity(intent);
				break;

			default:
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	};
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intent_menu, menu);
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
