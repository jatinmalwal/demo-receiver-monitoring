package com.jm.monitoringbatterydemo;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements StateChangeListener {

	private BatteryChangedReceiver receiver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	protected void onResume() {

		// Make a intent filer
		IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);

		// Make an object of your receiver
		receiver = new BatteryChangedReceiver();

		Intent intentBatteryStatus = this.registerReceiver(receiver, intentFilter);

		// Are we charging / charged?
		int status = intentBatteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;

		// How are we charging?
		int chargePlug = intentBatteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
		boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;

		int resourceIconId = intentBatteryStatus.getIntExtra(BatteryManager.EXTRA_ICON_SMALL, -1);

		ImageView iv = (ImageView) findViewById(R.id.iv_icon_battery);
		iv.setBackgroundResource(resourceIconId);

		int level = intentBatteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
		int scale = intentBatteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

		float batteryPct = level / (float) scale;

		TextView tv = (TextView) findViewById(R.id.tv_status);
		tv.setText("isCharging : " + isCharging + "\n usb : " + usbCharge + "\n acCharge : " + acCharge + "\n Percent : " + batteryPct);
		super.onResume();
	}

	@Override
	protected void onPause() {
		// Unregister receiver
		this.unregisterReceiver(receiver);
		super.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void stateChanged(Intent intent) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void onNewIntent(Intent intent) {
		setIntent(intent);
		super.onNewIntent(intent);
	}

}
