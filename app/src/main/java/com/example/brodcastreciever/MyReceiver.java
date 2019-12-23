package com.example.brodcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context c, Intent i) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(i.getAction())) {
            Toast.makeText(c, "Boot is completed", Toast.LENGTH_SHORT).show();
            Log.d("==Changed==", "Boot is completed");
            i = new Intent(c,MyService.class);
            c.startService(i);
        }
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(i.getAction())) {
            Toast.makeText(c, "Mode is completed", Toast.LENGTH_SHORT).show();
            Log.d("==Changed==", "Boot is completed");
            i = new Intent(c,MyService.class);
            c.startService(i);
        }
    }
}