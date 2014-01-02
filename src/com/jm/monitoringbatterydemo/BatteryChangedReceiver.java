package com.jm.monitoringbatterydemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryChangedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

//		 Toast.makeText(context, "" + intent.getAction(),
//		 Toast.LENGTH_LONG).show();
		intent.setClass(context, MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);

	}

}
