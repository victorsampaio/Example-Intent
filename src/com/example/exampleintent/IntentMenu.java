package com.example.exampleintent;

import com.example.screen.SecondScreen;
import com.example.screenYesNo.ScreenYesOrNo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
		// setContentView(R.layout.activity_intent_menu);

		String[] topic = new String[] { "Open Activity w/ Parameters",
				"Activity return Information", "3", "4", "Exit" };

		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, topic));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		try {
			switch (position) {
			case 0:
				Intent intent = new Intent(this, SecondScreen.class);
				intent.putExtra("message",
						"Test to Intent. This is Second Screen!");
				startActivity(intent);
				break;
			case 1:
				startActivityForResult(new Intent(this, ScreenYesOrNo.class),
						ACTIVITY_YES_NO);
				break;
			case 2:
				Intent inte = new Intent(this, SecondScreen.class);
				inte.putExtra("Message",
						"Test to Intent. This is Second Screen!");
				startActivity(inte);
				break;
			case 3:
				Intent intee = new Intent(this, SecondScreen.class);
				intee.putExtra("Message",
						"Test to Intent. This is Second Screen!");
				startActivity(intee);
				break;
			case 4:
				Intent inteee = new Intent(this, SecondScreen.class);
				inteee.putExtra("message",
						"Test to Intent. This is Second Screen!");
				startActivity(inteee);
				break;
			default:
				finish();
			}

		} catch (Exception e) {
			Toast.makeText(this, "Erro :" + e.getMessage(), Toast.LENGTH_SHORT)
					.show();

		}
	};

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent it) {
		Log.i(CATEGORY, "IntentMenu: " + requestCode + ", Result: "
				+ resultCode + " > " + it);
		if (requestCode == ACTIVITY_YES_NO) {
			Bundle params = it != null ? it.getExtras() : null;
			if (params != null) {
				String msg = params.getString("msg");
				if (resultCode == 1) {
					// Yes
					Toast.makeText(this, "Selected Yes: " + msg,
							Toast.LENGTH_SHORT).show();
				}else if (resultCode == 2) {
					//No
					Toast.makeText(this, "Selected No: " + msg, Toast.LENGTH_SHORT).show();
					
				}else {
					// Cancel
					Toast.makeText(this, "Not Defined: " + msg, Toast.LENGTH_SHORT).show();
				}
			}
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
