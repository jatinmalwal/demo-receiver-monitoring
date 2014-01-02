package com.jm.monitoringbatterydemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestOneActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_one);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test_one, menu);
		return true;
	}

}
