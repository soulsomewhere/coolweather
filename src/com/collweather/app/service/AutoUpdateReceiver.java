package com.collweather.app.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// 使用的方法就是安卓第一行代码前边的执行定时任务的代码
		Intent i = new Intent(context, AutoUpdateService.class);
		context.startService(i);
	}

}
