package com.collweather.app.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// ʹ�õķ������ǰ�׿��һ�д���ǰ�ߵ�ִ�ж�ʱ����Ĵ���
		Intent i = new Intent(context, AutoUpdateService.class);
		context.startService(i);
	}

}
