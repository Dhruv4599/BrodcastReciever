package com.example.brodcastreciever;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    int cnt=1;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        cnt=1;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(cnt<=15){

                    Toast.makeText(MyService.this,"Count = "+cnt,Toast.LENGTH_SHORT).show();
                    Log.d("==MYMSG==","Count = "+cnt);

                    new Handler().postDelayed(this,3000);
                }

                cnt++;
            }
        },3000);


        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyService.this,"Service Destroyed",Toast.LENGTH_SHORT).show();
        Log.d("==MYMSG==","Service Destroyed");
    }
}
