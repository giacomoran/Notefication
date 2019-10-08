package com.ran3000.notefication2.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.content.ContextCompat;

import com.ran3000.notefication2.NoteficationForegroundService;

import java.util.Objects;

// Can be registered from the manifest, see: https://developer.android.com/guide/components/broadcast-exceptions.html
public class BootCompletedReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, NoteficationForegroundService.class);
            ContextCompat.startForegroundService(context, serviceIntent);
        }
    }

}
