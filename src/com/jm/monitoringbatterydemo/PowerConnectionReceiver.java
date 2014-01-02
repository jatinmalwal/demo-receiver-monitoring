package com.jm.monitoringbatterydemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerConnectionReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {

		Toast.makeText(context, "" + intent.getAction(), Toast.LENGTH_LONG).show();

		/*
		 * int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		 * boolean isCharging = status ==
		 * BatteryManager.BATTERY_STATUS_CHARGING; boolean isFull = status ==
		 * BatteryManager.BATTERY_STATUS_FULL;
		 * 
		 * int chargePlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED,
		 * -1); boolean usbCharge = chargePlug ==
		 * BatteryManager.BATTERY_PLUGGED_USB;
		 * 
		 * 
		 * if (true) { Intent intentOne = new Intent(context,
		 * TestOneActivity.class);
		 * intentOne.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		 * context.startActivity(intentOne); }
		 * 
		 * 
		 * boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
		 * 
		 * int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1); int
		 * scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
		 * 
		 * float batteryPct = level / (float) scale;
		 * 
		 * Log.d("JM-CHECK", "isCharging : " + isCharging + "\n usb : " +
		 * usbCharge + "\n acCharge : " + acCharge + "\n Percent : " +
		 * batteryPct);
		 * 
		 * Toast.makeText( context, ("JM-CHECK" + "isCharging : " + isCharging +
		 * "\n usb : " + usbCharge + "\n acCharge : " + acCharge +
		 * "\n Percent : " + batteryPct), Toast.LENGTH_SHORT).show();
		 */
	}
}
